package com.tizo.products.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tizo.products.entities.Product;
import com.tizo.products.repositories.ProductsRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource {
	
	@Autowired
	private ProductsRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
		
	}
	
	
	@GetMapping(value = "/search")
	public ResponseEntity<Product> findByName(@RequestParam String name){
		Product obj = repository.findByName(name);
		return ResponseEntity.ok(obj);
		
	}
	
	@PostMapping(value = "/novo")
	public void novo(@ModelAttribute Product produto) {

		repository.saveAndFlush(produto);
		
	}
}
