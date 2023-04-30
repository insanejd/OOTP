package factoryMethod.EmpireFacotry;

import factoryMethod.Product;

public class EmpireTable extends Product {

    @Override
    public void createProduct() {
        System.out.println("Створення ампір стола");
    }
}
