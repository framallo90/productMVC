package com.framallo90.categories.controller;

import com.framallo90.categories.model.entities.Category;
import com.framallo90.categories.model.repositories.CategoryRepository;
import com.framallo90.categories.view.CategoryView;

import java.util.Scanner;

public class CategoryController {
    private CategoryRepository categoryRepository;
    private CategoryView categoryView;

    public CategoryController(CategoryRepository categoryRepository, CategoryView categoryView){
        this.categoryRepository = categoryRepository;
        this.categoryView = categoryView;
    }

    public void createCategory(){
        Category category = categoryView.createCategory();
        categoryRepository.addListCategory(category);
        categoryView.viewCategory(category);
    }

    public void createCategories(){
        Scanner scanner = new Scanner(System.in);
        char c = 's';
        System.out.println("CARGANDO CATEGORIAS ");
        while(c == 's'){
            createCategory();
            System.out.print("Seguir cargando? (s) para seguir: ");
            c = scanner.next().charAt(0);
        }
    }
    public void searchCategory(){
        Category category = categoryView.searchCategory(categoryRepository.getListCategories());
    }

    public Category searchCategoryName(String name){
        Category category = categoryView.searchCategoryName(categoryRepository.getListCategories(), name);
        return category;
    }

    public void updateCategory(){
        categoryView.updateCategory(categoryRepository.getListCategories());
        categoryView.readCategoryList(categoryRepository.getListCategories());
    }

    public void removeCategory(){
        categoryView.removeCategory(categoryRepository.getListCategories());
        categoryView.readCategoryList(categoryRepository.getListCategories());
    }

    public void readCategoryList(){
        categoryView.readCategoryList(categoryRepository.getListCategories());
    }

}
