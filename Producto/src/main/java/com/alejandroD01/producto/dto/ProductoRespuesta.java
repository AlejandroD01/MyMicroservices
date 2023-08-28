package com.alejandroD01.producto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoRespuesta {
    private String id;
    private String nombre;
    private float precio;
    private int cantidadTotal;

}
