package com.framallo90.categories.view;

import com.framallo90.categories.model.entities.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryView {
        public void viewCategory(Category category){
            System.out.println("Category name: "+ category.getName());
            System.out.println("Category id: "+ category.getId());
        }

        public Category createCategory(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la categoria");
            String nameCategory = scanner.nextLine();

            System.out.println("Ingrese el id");
            Integer id = scanner.nextInt();

            return new Category(id, nameCategory);
        }

        public Category searchCategory(ArrayList<Category> lista) {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            Category categoriaEncontrada = null;
            System.out.print("Id de la categoria a buscar: ");
            Integer buscarId = scanner.nextInt();
            for(Category category : lista) {
                if (buscarId == category.getId()) {
                    categoriaEncontrada = category;
                    break;
                }
            }
            if(categoriaEncontrada == null){
                System.out.println("Categoria no encontrada");
            }else{
                System.out.println("La Categoria se encuentra en la lista");
            }
            return categoriaEncontrada;
        }

    public Category searchCategoryName(ArrayList<Category> lista,String nameSearch) {
        String buscarNom = nameSearch.toLowerCase();
        for (Category category : lista) {
            if (category.getName().toLowerCase().equals(buscarNom)) {
                return category;
            }
        }
        System.out.println("Categoria no encontrada");
        return null;
    }

        public void removeCategory(ArrayList<Category> lista){
            System.out.println("ELIMINANDO CATEGORIA ");
            Category eliminarC = searchCategory(lista);

            if(eliminarC == null){
                System.out.println("La Categoria no se encuentra en la lista");
            }else{
                lista.remove(eliminarC);
                System.out.println("La Categoria ha sido eliminado correctamente.");
            }
        }

        public void updateCategory(ArrayList<Category> lista) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("MODICANDO CATEGORIA");
            Category modificarC = searchCategory(lista);

            if(modificarC == null){
                System.out.println("La Categoria no se encuentra en la lista");

            }else{
                System.out.println(modificarC.toString());
                System.out.println("Ingrese el nuevo nombre para la Categoria");
                String nuevoNombre = scanner.nextLine();
                modificarC.setName(nuevoNombre);
                System.out.println("La Categoria ha sido modificada correctamente.");
            }
        }

        public void readCategoryList(ArrayList<Category> lista){
            System.out.println("LISTA: ");
            for(Category category : lista){
                System.out.println(category.toString());;
            }
        }
}
