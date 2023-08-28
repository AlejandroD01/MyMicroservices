package com.alejandroD01.producto.repository;


import com.alejandroD01.producto.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {

}
