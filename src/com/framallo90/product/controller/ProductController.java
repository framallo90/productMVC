package com.framallo90.product.controller;

import com.framallo90.product.model.entities.Product;
import com.framallo90.product.model.repositories.ProductRepository;
import com.framallo90.product.view.ProductView;

public class ProductController {
    private ProductView productView;
    private ProductRepository productRepository;

    public ProductController(ProductView productView, ProductRepository productRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
    }

    public void createProduct(){
        //crear producto
        Product product = this.productView.createProduct();
        //guardar producto
        this.productRepository.addListProduct(product);
        //mostrar el producto
        this.productView.viewProduct(product);
    }
}
