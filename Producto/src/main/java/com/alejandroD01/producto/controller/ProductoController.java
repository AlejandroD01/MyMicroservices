package com.alejandroD01.producto.controller;

import com.alejandroD01.producto.dto.ProductoRespuesta;
import com.alejandroD01.producto.dto.ProductoSolicitud;
import com.alejandroD01.producto.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor // anotacion de lombok para sustituir  todos los autowires
public class ProductoController {

    //no hay que inicialisarlo con @Autowire gracias a lo de arriba
    private final ProductoService productoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductoSolicitud productoSolicitud) {
        productoService.crearProduct(productoSolicitud);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoRespuesta> getAllProducts() {
        return productoService.getAllProducts();
    }

    @DeleteMapping(value="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarProducto(@PathVariable String id){
      productoService.deleteProducto(id);
    }

}
