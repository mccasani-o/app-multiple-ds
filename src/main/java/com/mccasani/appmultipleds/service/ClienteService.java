package com.mccasani.appmultipleds.service;

import com.mccasani.appmultipleds.dao.CategoriaDao;
import com.mccasani.appmultipleds.dao.ClienteDao;
import com.mccasani.appmultipleds.model.Categoria;
import com.mccasani.appmultipleds.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteDao clienteDao;

    public List<Cliente>listaClientes(){
        return this.clienteDao.listaClientes();
    }
}
