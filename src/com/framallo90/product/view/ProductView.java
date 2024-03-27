package com.framallo90.product.view;

import com.framallo90.categories.controller.CategoryController;
import com.framallo90.categories.model.entities.Category;
import com.framallo90.categories.model.repositories.CategoryRepository;
import com.framallo90.categories.view.CategoryView;
import com.framallo90.product.model.entities.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    CategoryView categoryView = new CategoryView();
    CategoryRepository categoryRepository = new CategoryRepository();
    CategoryController categoryController = new CategoryController(categoryRepository, categoryView);

    public void viewProduct(Product product){
        System.out.println("Product name: "+ product.getNameProduct());
        System.out.println("Product id: "+ product.getId());
    }

    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nameProduct = scanner.nextLine();

        System.out.println("Ingrese el id");
        int id = scanner.nextInt();

        scanner.nextLine();

        Category categoria = null;
        do {
            categoryController.readCategoryList();

            System.out.println("Ingrese la categoría del producto:");
            String categoryName = scanner.nextLine();
            categoria = categoryController.searchCategoryName(categoryName);

            if (categoria == null) {
                System.out.println("La categoría ingresada no existe, vuelva a intentarlo.");
            }
        } while (categoria == null);

        return new Product(id, nameProduct, categoria);
    }

    public Product searchProduct(ArrayList<Product> lista) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        Product productoEncontrado = null;
        System.out.print("Id del producto a buscar: ");
        Integer buscarId = scanner.nextInt();
        for(Product producto : lista) {
            if (buscarId == producto.getId()) {
                productoEncontrado = producto;
                break;
            }
        }
        if(productoEncontrado == null){
            System.out.println("Producto no encontrado");
        }else{
            System.out.println("El producto se encuentra en la lista");
        }
        return productoEncontrado;
    }

    public void removeProduct(ArrayList<Product> lista){
        System.out.println("ELIMINANDO PRODUCTO ");
        Product eliminarP = searchProduct(lista);

        if(eliminarP == null){
            System.out.println("El producto no se encuentra en la lista");
        }else{
            lista.remove(eliminarP);
            System.out.println("El Producto ha sido eliminado correctamente.");
        }
    }

    public void updateProduct(ArrayList<Product> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MODICANDO PRODUCTO");
        Product modificarP = searchProduct(lista);

        if(modificarP == null){
            System.out.println("El producto no se encuentra en la lista");

        }else{
            System.out.println(modificarP.toString());
            System.out.println("Ingrese el nuevo nombre para el producto");
            String nuevoNombre = scanner.nextLine();
            modificarP.setNameProduct(nuevoNombre);
            System.out.println("Ingrese la nueva categoria");
            String nuevaCategoria = scanner.nextLine();
            Category newCategory = categoryController.searchCategoryName(nuevaCategoria);
            modificarP.setCategory(newCategory);
            System.out.println("El Producto ha sido modificado correctamente.");
        }
    }

    public void readProductList(ArrayList<Product> lista){
        System.out.println("LISTA: ");
        for(Product product : lista){
            System.out.println(product.toString());;
        }
    }
}
