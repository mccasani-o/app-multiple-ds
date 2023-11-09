package com.mccasani.appmultipleds;

import com.mccasani.appmultipleds.dao.ClienteDao;
import com.mccasani.appmultipleds.model.Categoria;
import com.mccasani.appmultipleds.model.Cliente;
import com.mccasani.appmultipleds.service.CategoriaService;
import com.mccasani.appmultipleds.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final CategoriaService categoriaService;
    private final ClienteService clienteDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Categoria> categorias = this.categoriaService.listaCategoria();
        System.out.println(categorias);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        List<Cliente> clientes = this.clienteDao.listaClientes();
        System.out.println(clientes);
    }
}
