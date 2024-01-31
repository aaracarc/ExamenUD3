package org.iesvdm.pruebaud3.dao;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.iesvdm.pruebaud3.modelo.Idioma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Slf4j
@Repository
@AllArgsConstructor
public class IdiomaDAOImpl implements IdiomaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Optional<Idioma> find(int id) {
        return Optional.empty();
    }
}
