package com.alejandroD01.cliente.controller;

import com.alejandroD01.cliente.dto.ClienteSolicitud;
import com.alejandroD01.cliente.service.ClienteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor //funcion del @Autowired
@RequestMapping("/api/cliente")
public class ClienteControlador {

    private final ClienteServicio clienteServicio;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCliente(@RequestBody ClienteSolicitud clienteSolicitud) {
        clienteServicio.crearCliente(clienteSolicitud);
    }
}
