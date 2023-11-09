package com.mccasani.appmultipleds.dao.maper;

import com.mccasani.appmultipleds.model.Categoria;
import com.mccasani.appmultipleds.model.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {

    public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {

        Cliente categoria = new Cliente();
        categoria.setId(resultSet.getLong("id"));
        categoria.setNombre(resultSet.getString("nombre"));
        categoria.setApellidos(resultSet.getString("apellidos"));
        categoria.setNroDocumento(resultSet.getString("numero_documento"));
        categoria.setCorreo(resultSet.getString("correo"));
        categoria.setTelefono(resultSet.getString("telefono"));
        categoria.setEstado(resultSet.getString("estado"));

        return categoria;
    }
}
