package factoryMethod.ModernFactory;

import factoryMethod.Product;

public class ModernSofa extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення модерн дивану");
    }
}
