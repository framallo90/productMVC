import com.framallo90.categories.controller.CategoryController;
import com.framallo90.categories.model.repositories.CategoryRepository;
import com.framallo90.categories.view.CategoryView;
import com.framallo90.product.controller.ProductController;
import com.framallo90.product.model.repositories.ProductRepository;
import com.framallo90.product.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView productView= new ProductView();
        CategoryView categoryView = new CategoryView();
        ProductRepository productRepository= new ProductRepository();
        CategoryRepository categoryRepository = new CategoryRepository();
        ProductController productController= new ProductController(productView,productRepository);
        CategoryController categoryController = new CategoryController(categoryRepository, categoryView);

        categoryController.createCategories();
        categoryController.readCategoryList();
        categoryController.updateCategory();
        categoryController.removeCategory();

        productController.createProducts();
        productController.readProduct();
        productController.updateProduct();
        productController.removeProduct();


    }
}