package org.iesvdm.pruebaud3.dao;

import org.iesvdm.pruebaud3.modelo.Idioma;

import java.util.Optional;

public interface IdiomaDAO {

    /**
     * Recupera un idioma específico basado en su identificador único.
     * @param id El identificador único del idioma a recuperar.
     * @return Un objeto Optional<Idioma> que contiene el idioma recuperado, o está vacío si no se encuentra.
     */
    Optional<Idioma> find(int id);
}
