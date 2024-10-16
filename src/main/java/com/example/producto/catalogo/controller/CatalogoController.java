package com.example.producto.catalogo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.producto.catalogo.mensaje.ProductoMarca;
import com.example.producto.catalogo.servicio.IProductoServicio;

@RestController
public class CatalogoController {

	@Autowired
	private IProductoServicio productoService;
	
	//Peticion Get para ver listado completo de la base de datos
	@GetMapping("/list")
	public List<ProductoMarca> listItems(){
		return productoService.findAll();
	}

	//Peticion Get para ver elemento concreto de la base de datos
	@GetMapping("/list/{id}")
	public ProductoMarca Itemid(@PathVariable("id") Long id){
		return productoService.findId(id);
	}
	
	// Peticion Delete para eliminar un elemento de la base de datos a través de su Id
	@DeleteMapping("/item/delete/{id}")
	public String deleteItem(@PathVariable("id") Long id) { 
		 return productoService.deleteItem(id);
	}

	//Peticion Put para modificar un elemento de la base de datos por su Id
	@PutMapping("/item/{id}") 
	public String updateItem(@PathVariable("id") Long id, @RequestBody ProductoMarca productomarca) { 
	       return productoService.updateItem(id, productomarca);
	}

	//Peticion Post para crear un elemento nuevo en la base de datos
	@PostMapping("/item/new") 
	public ProductoMarca createItem(@RequestBody ProductoMarca productomarca) { 
	       return productoService.createItem(productomarca);
	}
}
