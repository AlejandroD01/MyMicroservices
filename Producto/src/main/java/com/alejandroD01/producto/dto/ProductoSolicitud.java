package com.alejandroD01.producto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoSolicitud {

    private String id;
    private String nombre;

    private float precio;
    private int cantidadTotal;
}

