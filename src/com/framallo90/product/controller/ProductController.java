package com.framallo90.product.controller;

import com.framallo90.product.model.entities.Product;
import com.framallo90.product.model.repositories.ProductRepository;
import com.framallo90.product.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void createProducts(){
        Scanner scanner = new Scanner(System.in);
        char c = 's';
        System.out.println("CARGANDO LISTA ");
        while(c == 's'){
            createProduct();
            //volver a cargar el producto
            System.out.print("Seguir cargando? (s) para seguir: ");
            c = scanner.next().charAt(0);
        }
    }

    public void searchProduct(){
        Product product = productView.searchProduct(productRepository.getListProducts());
    }

    public void updateProduct(){
        productView.updateProduct(productRepository.getListProducts());
        productView.readProductList(productRepository.getListProducts());
    }

    public void removeProduct(){
       productView.removeProduct(productRepository.getListProducts());
       productView.readProductList(productRepository.getListProducts());
    }

    public void readProduct(){
        productView.readProductList(productRepository.getListProducts());
    }
}
