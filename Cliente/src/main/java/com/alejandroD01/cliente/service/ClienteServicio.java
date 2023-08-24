package com.alejandroD01.cliente.service;

import com.alejandroD01.cliente.dto.ClienteSolicitud;
import com.alejandroD01.cliente.model.Cliente;
import com.alejandroD01.cliente.repository.ClienteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClienteServicio {

    public final ClienteRepositorio clienteRepositorio;
        public void crearCliente(ClienteSolicitud clienteSolicitud){

            Cliente cliente = new Cliente();

            cliente.setNombre(clienteSolicitud.getNombre());
            cliente.setApellido(clienteSolicitud.getApellido());
            cliente.setDni(clienteSolicitud.getDni());
            cliente.setTelefono(clienteSolicitud.getTelefono());
            cliente.setEmail(clienteSolicitud.getEmail());
         clienteRepositorio.save(cliente);
    }
}
