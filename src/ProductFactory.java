import java.util.HashMap;
import java.util.Map;

public final class ProductFactory {

    private static Map<String, Product> registry = new HashMap<String, Product>();


    public Product createProduct(String name) {
        return registry.get(name).createProduct();
    }

    public static void registerProduct(String name, Product product) {
        registry.put(name, product);
    }
}
