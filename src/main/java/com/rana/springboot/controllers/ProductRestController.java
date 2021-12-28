package com.rana.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rana.springboot.entites.Product;
import com.rana.springboot.repos.ProductRepository;

@RestController
public class ProductRestController {
	@Autowired
	ProductRepository repository;

	@GetMapping(value = "/products/")
	public List<Product> getProducts() {

		return repository.findAll();

	}

	@GetMapping(value = "/products/{id}")
	public Product getProductById(@PathVariable("id") int id) {

		return repository.findById(id).get();

	}

	@PostMapping(value = "/products/")
	public Product createProduct(@RequestBody Product product) {

		return repository.save(product);

	}

	@PutMapping(value = "/products/")
	public Product updateProduct(@RequestBody Product product) {

		return repository.save(product);

	}

	@DeleteMapping(value = "/products/{id}")
	public void delete(@PathVariable("id") int id) {

		repository.deleteById(id);

	}

	@PatchMapping(value = "/products/")
	public Product partialUpdate(@RequestBody Product product) {

		return repository.save(product);

	}

}