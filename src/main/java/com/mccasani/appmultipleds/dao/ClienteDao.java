package com.mccasani.appmultipleds.dao;

import com.mccasani.appmultipleds.dao.maper.CategoriaMapper;
import com.mccasani.appmultipleds.dao.maper.ClienteMapper;
import com.mccasani.appmultipleds.model.Categoria;
import com.mccasani.appmultipleds.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ClienteDao {

    @Autowired
    @Qualifier("universitydatasource")
    private DataSource universitydatasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static final String SQL_GET_ALL = "select * from clientes";

    public List<Cliente> listaClientes() {
        this.jdbcTemplate.setDataSource(this.universitydatasource);
        return jdbcTemplate.query(SQL_GET_ALL, new ClienteMapper());

    }
}
