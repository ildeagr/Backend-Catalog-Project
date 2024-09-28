package com.example.producto.catalogo.mensaje;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="marca")
public class ProductoMarca implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Integer precio;
	private String articulo;
	
	public ProductoMarca() {

	}

	public ProductoMarca(Long id, String nombre, Integer precio, String articulo) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.articulo = articulo;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	private static final long serialVersionUID = 704674473724120359L;
	
}
