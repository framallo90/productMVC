package com.framallo90.categories.model.repositories;

import com.framallo90.categories.model.entities.Category;

import java.util.ArrayList;

public class CategoryRepository {
        private ArrayList<Category> listCategories;

    public ArrayList<Category> getListCategories() {
        return listCategories;
    }

    public void setListCategories(ArrayList<Category> listCategories) {
        this.listCategories = listCategories;
    }

    public CategoryRepository() {
            this.listCategories = new ArrayList<>();
        }

    public void addListCategory(Category category){
            this.listCategories.add(category);
        }
 }
