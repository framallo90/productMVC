package com.framallo90.product.view;

import com.framallo90.product.model.entities.Product;

import java.util.Scanner;

public class ProductView {
    public void viewProduct(Product product){
        System.out.println("Product name: "+ product.getNameProduct());
        System.out.println("Product id: "+ product.getId());
    }

    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nameProduct = scanner.nextLine();

        System.out.println("Ingrese el id");
        Integer id = scanner.nextInt();

        return new Product(id,nameProduct);
    }


}
