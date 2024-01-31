package org.iesvdm.pruebaud3.dao;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.pruebaud3.modelo.Idioma;
import org.iesvdm.pruebaud3.modelo.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Slf4j
@Repository
public class PeliculaDAOImpl implements PeliculaDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public synchronized void create(Pelicula pelicula) {
        String sqlInsert = """
                INSERT INTO pelicula (id_pelicula, titulo, descripcion,
                fecha_lanzamiento, id_idioma, duracion_alquiler, rental_rate,
                duracion, replacement_cost, ultima_actualizacion)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rows = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sqlInsert, new String[]{"id"});
            int idx = 1;
            ps.setInt(idx++, pelicula.getId());
            ps.setString(idx++, pelicula.getTitulo());
            ps.setString(idx++, pelicula.getDescripcion());
            java.sql.Date fechaSql = new java.sql.Date(pelicula.getFecha_lanzamiento().getTime());
            ps.setDate(idx++, fechaSql);
            ps.setInt(idx++, pelicula.getIdioma().getId());
            ps.setInt(idx++, pelicula.getDuracion_alquiler());
            ps.setDouble(idx++, pelicula.getRental_rate());
            ps.setInt(idx++, pelicula.getDuracion());
            ps.setDouble(idx++, pelicula.getReplacement_cost());
            fechaSql = new java.sql.Date(pelicula.getUltima_actualizacion().getTime());
            ps.setDate(idx++, fechaSql);

            return ps;
        }, keyHolder);

        pelicula.setId(keyHolder.getKey().intValue());

        log.info("Insertados {} registros.", rows);
    }

    /**
     * Devuelve lista con todos las Peliculas.
     */
    @Override
    public List<Pelicula> getAll() {

        List<Pelicula> listaPeliculas = jdbcTemplate.query(
                "SELECT * FROM pelicula P LEFT JOIN idioma I on P.id_pelicula = I.id_idioma",
                (rs, rowNum) -> new Pelicula(
                        rs.getInt("id_pelicula"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        rs.getDate("fecha_lanzamiento"),
                        new Idioma(
                                rs.getInt("id_idioma"),
                                rs.getString("nombre"),
                                rs.getDate("ultima_actualizacion")
                        ),
                        rs.getInt("duracion_alquiler"),
                        rs.getDouble("rental_rate"),
                        rs.getInt("duracion"),
                        rs.getDouble("replacement_cost"),
                        rs.getDate("ultima_actualizacion"))
        );

        log.info("Devueltos {} registros.", listaPeliculas.size());

        return listaPeliculas;

    }
}
