package com.example.producto.catalogo.servicio;

import java.util.List;

import com.example.producto.catalogo.mensaje.ProductoMarca;

public interface IProductoServicio {
	
	public List<ProductoMarca> findAll();
	public String deleteItem(Long id);
	public String updateItem(Long id, ProductoMarca productomarca);
}
