package com.framallo90.product.model.entities;

import com.framallo90.categories.model.entities.Category;

public class Product {
    private Integer id; //Privado para ocultar la info.
    private String nameProduct;
    private Category category;

    public Product(Integer id, String nameProduct, Category category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", category=" + category +
                '}';
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
