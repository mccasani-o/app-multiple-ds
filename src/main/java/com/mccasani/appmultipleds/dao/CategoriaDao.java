package com.mccasani.appmultipleds.dao;

import com.mccasani.appmultipleds.dao.maper.CategoriaMapper;
import com.mccasani.appmultipleds.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
@Repository
public class CategoriaDao {

    @Autowired
    @Qualifier("datasource")
    private DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static final String SQL_GET_ALL = "select * from categorias";

    public List<Categoria> listaCategoria() {
        this.jdbcTemplate.setDataSource(this.datasource);
        return jdbcTemplate.query(SQL_GET_ALL, new CategoriaMapper());

    }
}
