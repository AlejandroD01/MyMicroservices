package com.alejandroD01.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteSolicitud {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
}
