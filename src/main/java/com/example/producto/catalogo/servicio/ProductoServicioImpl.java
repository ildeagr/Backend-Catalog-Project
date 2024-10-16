package com.example.producto.catalogo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.producto.catalogo.dao.ProductoDao;
import com.example.producto.catalogo.mensaje.ProductoMarca;



@Service
public class ProductoServicioImpl implements IProductoServicio{

	@Autowired
	private ProductoDao productodao;
	

	@Override
	@Transactional(readOnly = true) 
	public List<ProductoMarca> findAll() {
		return (List<ProductoMarca>) productodao.findAll();
	}

	@Override
	@Transactional(readOnly = true) 
	public ProductoMarca findId(Long id) {
		return productodao.findById(id).orElse(null);
	}

	@Override
	public String deleteItem(Long id) {
		String result;
		Optional<ProductoMarca> found = productodao.findById(id);
		
		if(found.isEmpty()) result= "Item no encontrado";

		else {
			productodao.deleteById(id);
			result = "Item eliminado con exito";
		}

		return result;
	}

	@Override
	public String updateItem(Long id, ProductoMarca productomarca) {
		String result;
		Optional<ProductoMarca> found = productodao.findById(id);
		
		if(found.isEmpty()) result= "Item no encontrado";

		else {
			productodao.save(productomarca);
			result = "Item Modificado";
		}
		
		return result;
	}

	@Override
	public ProductoMarca createItem(ProductoMarca productomarca) {
			return productodao.save(productomarca);
	}
}
