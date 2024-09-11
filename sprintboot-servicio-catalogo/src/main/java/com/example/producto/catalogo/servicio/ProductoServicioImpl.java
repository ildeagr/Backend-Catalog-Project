package com.example.producto.catalogo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.producto.catalogo.dao.ProductoDao;
import com.example.producto.catalogo.mensaje.ProductoMarca;
import com.example.producto.catalogo.mensaje.ProductoMensaje;



@Service
public class ProductoServicioImpl implements IProductoServicio{

	@Autowired
	private ProductoDao productodao;
	
	@Override
	public ProductoMensaje mensajeback() {
		ProductoMensaje mensaje=new ProductoMensaje();
		mensaje.setMensaje("Hola Mundo");
		
		return mensaje;
	}

	@Override
	@Transactional(readOnly = true) 
	public List<ProductoMarca> findAll() {
		return (List<ProductoMarca>) productodao.findAll();
	}

}
