import com.framallo90.categories.controller.CategoryController;
import com.framallo90.categories.model.repositories.CategoryRepository;
import com.framallo90.categories.view.CategoryView;
import com.framallo90.product.controller.ProductController;
import com.framallo90.product.model.repositories.ProductRepository;
import com.framallo90.product.view.ProductView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductView productView= new ProductView();
        ProductRepository productRepository= new ProductRepository();
        ProductController productController= new ProductController(productView,productRepository);

        CategoryView categoryView = new CategoryView();
        CategoryRepository categoryRepository = new CategoryRepository();
        CategoryController categoryController = new CategoryController(categoryRepository, categoryView);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Crear categoría");
            System.out.println("2. Leer lista de categorías");
            System.out.println("3. Actualizar categoría");
            System.out.println("4. Eliminar categoría");
            System.out.println("5. Crear producto");
            System.out.println("6. Leer producto");
            System.out.println("7. Actualizar producto");
            System.out.println("8. Eliminar producto");
            System.out.println("9. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    categoryController.createCategories();
                    break;
                case 2:
                    categoryController.readCategoryList();
                    break;
                case 3:
                    categoryController.updateCategory();
                    break;
                case 4:
                    categoryController.removeCategory();
                    break;
                case 5:
                    productController.createProducts();
                    break;
                case 6:
                    productController.readProduct();
                    break;
                case 7:
                    productController.updateProduct();
                    break;
                case 8:
                    productController.removeProduct();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        } while (opcion != 9);

    }
}