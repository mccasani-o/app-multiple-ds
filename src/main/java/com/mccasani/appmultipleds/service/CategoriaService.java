package com.mccasani.appmultipleds.service;

import com.mccasani.appmultipleds.dao.CategoriaDao;
import com.mccasani.appmultipleds.model.Categoria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaDao categoriaDao;

    public List<Categoria>listaCategoria(){
        return this.categoriaDao.listaCategoria();
    }
}
