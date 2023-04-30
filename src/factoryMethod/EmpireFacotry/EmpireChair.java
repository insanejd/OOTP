package factoryMethod.EmpireFacotry;

import factoryMethod.Product;

public class EmpireChair extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення ампір стільця");
    }
}
