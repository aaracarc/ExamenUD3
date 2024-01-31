package org.iesvdm.pruebaud3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class Idioma {

    //Atributos
    private int id;
    private String nombre;
    private Date ultima_actualizacion;

    public Idioma(){}
}
