package com.example.producto.catalogo.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.producto.catalogo.mensaje.ProductoMarca;

public interface ProductoDao extends CrudRepository<ProductoMarca,Long>{

	Optional<ProductoMarca> findByNombre(String nombre);

}