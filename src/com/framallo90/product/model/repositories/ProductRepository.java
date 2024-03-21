package com.framallo90.product.model.repositories;

import com.framallo90.product.model.entities.Product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> listProducts;

    public ProductRepository() {
        this.listProducts = new ArrayList<>();
    }

    public void addListProduct(Product product){
        this.listProducts.add(product);
    }

    public void removeListProduct(){

    }
}
