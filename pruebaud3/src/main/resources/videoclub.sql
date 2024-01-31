DROP DATABASE IF EXISTS videoclub_pruebaud3;
CREATE DATABASE videoclub_pruebaud3 CHARACTER SET utf8mb4;
USE videoclub_pruebaud3;

CREATE TABLE idioma (
                        id_idioma TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
                        nombre CHAR(20) NOT NULL,
                        ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        PRIMARY KEY (id_idioma)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE pelicula (
                          id_pelicula SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
                          titulo VARCHAR(255) NOT NULL,
                          descripcion TEXT DEFAULT NULL,
                          fecha_lanzamiento DATE DEFAULT NULL,
                          id_idioma TINYINT UNSIGNED NOT NULL,
                          duracion_alquiler TINYINT UNSIGNED NOT NULL DEFAULT 3,
                          rental_rate DECIMAL(4,2) NOT NULL DEFAULT 4.99,
                          duracion SMALLINT UNSIGNED DEFAULT NULL,
                          replacement_cost DECIMAL(5,2) NOT NULL DEFAULT 19.99,
                          ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                          PRIMARY KEY  (id_pelicula),
                          KEY idx_fk_id_idioma (id_idioma),
                          CONSTRAINT fk_film_idioma FOREIGN KEY (id_idioma) REFERENCES idioma (id_idioma) ON DELETE RESTRICT ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE categoria (
                           id_categoria TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
                           nombre VARCHAR(25) NOT NULL,
                           ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                           PRIMARY KEY  (id_categoria)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE pelicula_categoria (
                                    id_pelicula SMALLINT UNSIGNED NOT NULL,
                                    id_categoria TINYINT UNSIGNED NOT NULL,
                                    ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                    PRIMARY KEY (id_pelicula, id_categoria),
                                    CONSTRAINT fk_film_category_film FOREIGN KEY (id_pelicula) REFERENCES pelicula (id_pelicula) ON DELETE RESTRICT ON UPDATE CASCADE,
                                    CONSTRAINT fk_film_category_category FOREIGN KEY (id_categoria) REFERENCES categoria (id_categoria) ON DELETE RESTRICT ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;







