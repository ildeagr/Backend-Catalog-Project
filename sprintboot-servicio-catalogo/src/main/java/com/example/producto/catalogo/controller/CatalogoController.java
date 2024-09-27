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
	
<<<<<<< HEAD
	// Peticion Delete para eliminar un elemento de la base de datos a través de su Id
	@DeleteMapping("/item/delete/{id}")
	public String deleteItem(@PathVariable("id") Long id) { 
		 return productoService.deleteItem(id);
	}

	//Modificar Put un elemento de la base de datos por su Id
	@PutMapping("/item/{id}") 
	public String updateItem(@PathVariable("id") Long id, @RequestBody ProductoMarca productomarca) { 
	       return productoService.updateItem(id, productomarca);
	}
	
}
=======
	// Ejemplo de otras operacions posibles de Hibernate
	@DeleteMapping("/users/{id}") 
	public void deleteUser(@PathVariable("id") String id) { 
		 
	}
	
	@PutMapping("/users/{id}") 
	public void updateUser(@PathVariable("id") String id, @RequestBody User user) { 
	       
	}
	
}
>>>>>>> refs/remotes/origin/main
