public class Main {

    static {
        try {
            Class.forName("Product.Client");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProductFactory product = new ProductFactory();
    }
}
