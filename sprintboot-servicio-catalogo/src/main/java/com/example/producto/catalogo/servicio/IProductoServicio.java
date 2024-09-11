package com.example.producto.catalogo.servicio;

import java.util.List;

import com.example.producto.catalogo.mensaje.ProductoMarca;
import com.example.producto.catalogo.mensaje.ProductoMensaje;

public interface IProductoServicio {
	
	public ProductoMensaje mensajeback();
	public List<ProductoMarca> findAll();
}
