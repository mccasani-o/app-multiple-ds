package com.mccasani.appmultipleds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private Long id;
    private String nombre;
    private String apellidos;
    private String nroDocumento;
    private String correo;
    private String telefono;
    private String estado;
}
