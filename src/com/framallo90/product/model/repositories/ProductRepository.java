package com.framallo90.product.model.repositories;

import com.framallo90.product.model.entities.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {
    private ArrayList<Product> listProducts;

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public ProductRepository() {
        this.listProducts = new ArrayList<>();
    }

    public void addListProduct(Product product){
        this.listProducts.add(product);
    }

}
