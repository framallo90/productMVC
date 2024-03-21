package com.framallo90.product.model.entities;

public class Product {
    private Integer id; //Privado para ocultar la info.
    private String nameProduct;

    public Product(Integer id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
