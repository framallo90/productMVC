import com.framallo90.product.controller.ProductController;
import com.framallo90.product.model.entities.Product;
import com.framallo90.product.model.repositories.ProductRepository;
import com.framallo90.product.view.ProductView;

public class Main {
    public static void main(String[] args) {
        ProductView productView= new ProductView();
        ProductRepository productRepository= new ProductRepository();
        ProductController productController= new ProductController(productView,productRepository);
        productController.createProduct();
    }
}