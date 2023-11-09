package com.mccasani.appmultipleds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    private Long id;
    private String estado;
    private String nombre;
}
