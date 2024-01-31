package org.iesvdm.pruebaud3.service;

import org.iesvdm.pruebaud3.dao.IdiomaDAO;
import org.iesvdm.pruebaud3.modelo.Idioma;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IdiomaService {
    private IdiomaDAO idiomaDAO;

    public IdiomaService(IdiomaDAO idiomaDAO) {
        this.idiomaDAO = idiomaDAO;
    }

    public Idioma one(Integer id) {
        Optional<Idioma> optIdi = idiomaDAO.find(id);
        if (optIdi.isPresent())
            return optIdi.get();
        else
            return null;
    }
}
