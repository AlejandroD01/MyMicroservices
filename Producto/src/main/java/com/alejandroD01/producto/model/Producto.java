package com.alejandroD01.producto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

//definir clase como un mongodb document
@Document(value = "producto")
@AllArgsConstructor //loombok generar get, set, constructures vacio y llenos     :
@NoArgsConstructor
@Builder
@Data
public class Producto {

    @Id
    private String id;
    private String nombre;
    private float precio;
    private int cantidadTotal;
}
