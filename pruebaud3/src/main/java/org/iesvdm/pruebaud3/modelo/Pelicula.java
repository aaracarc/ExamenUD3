package org.iesvdm.pruebaud3.modelo;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.iesvdm.pruebaud3.dao.PeliculaDAO;

import java.util.Date;

@Data
@AllArgsConstructor
public class Pelicula {

    //Atributos
    private int id;
    @NonNull
    @Min(3)
    private String titulo;
    private String descripcion;
    private Date fecha_lanzamiento;
    private Idioma idioma;
    private int duracion_alquiler;
    private double rental_rate;
    private int duracion;
    private double replacement_cost;
    private Date ultima_actualizacion;

    public Pelicula() {}
}
