package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductServices;

@Service
public class ProductServiceImpl implements ProductServices {

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository=productRepository;
	}
	@Override
	public List<Product> listAllPro() {
		return productRepository.findAll();
	}

	@Override
	public void savePro(Product product) {
		productRepository.save(product);		
	}

	@Override
	public Product getPro(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void deletePro(long id) {
		productRepository.deleteById(id);
	}

}
