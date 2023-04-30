package factoryMethod.EmpireFacotry;

import factoryMethod.Product;

public class EmpireSofa extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення ампір дивану");
    }
}
