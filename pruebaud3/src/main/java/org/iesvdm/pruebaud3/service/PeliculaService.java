package org.iesvdm.pruebaud3.service;

import org.iesvdm.pruebaud3.dao.PeliculaDAO;
import org.iesvdm.pruebaud3.modelo.Pelicula;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    private PeliculaDAO peliculaDAO;

    public PeliculaService(PeliculaDAO peliculaDAO) {this.peliculaDAO = peliculaDAO;}

    public List<Pelicula> listAll() {

        return peliculaDAO.getAll();
    }

    public void newPelicula (Pelicula pelicula) {

        peliculaDAO.create(pelicula);

    }
}
