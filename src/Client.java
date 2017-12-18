public class Client implements Product {

    static {
        ProductFactory.registerProduct("Client", new Client());
    }

    @Override
    public Product createProduct() {
        return new Client();
    }
}
