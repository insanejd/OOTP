package factoryMethod.ModernFactory;

import factoryMethod.Product;

public class ModernChair extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення модерн стільця");
    }
}
