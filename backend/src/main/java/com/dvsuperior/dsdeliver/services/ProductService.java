package com.dvsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dvsuperior.dsdeliver.dto.ProductDTO;
import com.dvsuperior.dsdeliver.entities.Product;
import com.dvsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository; 
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc(); 
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
