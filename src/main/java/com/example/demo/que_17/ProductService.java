package com.example.demo.que_17;

public class ProductService {
	
	private ProductRepository prodRepo;

	public ProductService(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}

	public Product getById(long id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id);
	}

}
