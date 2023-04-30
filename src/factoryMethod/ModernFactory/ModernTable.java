package factoryMethod.ModernFactory;

import factoryMethod.Product;

public class ModernTable extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення модерн стола");
    }
}
