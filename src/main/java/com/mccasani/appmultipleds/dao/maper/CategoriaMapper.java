package com.mccasani.appmultipleds.dao.maper;

import com.mccasani.appmultipleds.model.Categoria;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaMapper implements RowMapper<Categoria> {

    public Categoria mapRow(ResultSet resultSet, int i) throws SQLException {

        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getLong("id"));
        categoria.setNombre(resultSet.getString("nombre"));
        categoria.setEstado(resultSet.getString("estado"));

        return categoria;
    }
}
