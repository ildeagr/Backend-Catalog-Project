package com.example.producto.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.producto.catalogo.mensaje.ProductoMarca;

public interface ProductoDao extends CrudRepository<ProductoMarca,Long>{

}