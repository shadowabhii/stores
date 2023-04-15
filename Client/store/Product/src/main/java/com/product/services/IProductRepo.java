package com.product.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
