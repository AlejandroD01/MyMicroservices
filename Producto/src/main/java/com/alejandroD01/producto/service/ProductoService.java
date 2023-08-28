package com.alejandroD01.producto.service;

import com.alejandroD01.producto.dto.ProductoRespuesta;
import com.alejandroD01.producto.dto.ProductoSolicitud;
import com.alejandroD01.producto.model.Producto;
import com.alejandroD01.producto.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j //log.info una estencion de lombok
public class ProductoService {

    //no hay que inicialisarlo con @Autowire gracias a @RequiredArgsConstructor
    private final ProductoRepository productoRepository;

    public void crearProduct(ProductoSolicitud productoSolicitud) {
        Producto producto = Producto.builder()
                .id(productoSolicitud.getId())
                .nombre(productoSolicitud.getNombre())
                .precio(productoSolicitud.getPrecio())
                .cantidadTotal(productoSolicitud.getCantidadTotal())
                .build();

        productoRepository.save(producto);
        log.info("Product {} is saved", producto.getId());
    }
    public void deleteProducto(String id){
        productoRepository.deleteById(id);
        log.info("Producto eliminado con exito", id);
    }

    public List<ProductoRespuesta> getAllProducts() {
        List<Producto> productos = productoRepository.findAll();

        return productos.stream().map(this::mapToProductRespuesta).toList();
    }

    private ProductoRespuesta mapToProductRespuesta(Producto product) {
        return ProductoRespuesta.builder()
                .id(product.getId())
                .nombre(product.getNombre())
                .precio(product.getPrecio())
                .cantidadTotal(product.getCantidadTotal())
                .build();
    }
}
