package com.example.producto.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.producto.catalogo.mensaje.ProductoMarca;
import com.example.producto.catalogo.mensaje.ProductoMensaje;
import com.example.producto.catalogo.servicio.IProductoServicio;

@RestController
public class CatalogoController {

	@Autowired
	private IProductoServicio productoService;
	
	@GetMapping("/saludos")
	public ProductoMensaje mostrarmensaje() {
		return productoService.mensajeback();
	  }
	
	@GetMapping("/listar")
	public List<ProductoMarca> seleccion(){
		return productoService.findAll();
	}
	
	/*  Ejemplo de otras operacions posibles de Hibernate
	@DeleteMapping("/users/{id}") 
	public void deleteUser(@PathVariable("id") String id) { 
		// Delete the user in this method with the id.  
	}
	
	@PutMapping("/users/{id}") 
	public void updateUser(@PathVariable("id") String id, @RequestBody User user) { 
	        // Update the user details here 
	}*/
	
}