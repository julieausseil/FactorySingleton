public class SingletonProduct {

    private volatile SingletonProduct instance;

    private SingletonProduct() {

    }

    public SingletonProduct getInstance() {
        SingletonProduct result = instance;
        if (instance == null) {
            synchronized (this){
                result = instance;
                if(result ==null){
                    instance = result = new SingletonProduct();
                }
            }
            instance = new SingletonProduct();
        }
        return instance;
    }
}
