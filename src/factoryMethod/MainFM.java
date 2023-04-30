package factoryMethod;

import factoryMethod.EmpireFacotry.EmpireFactory;
import factoryMethod.ModernFactory.ModernFactory;

public class MainFM {

    public static void main(String[] args) {
        System.out.println("Створення модерн продуктів\n");

        EmpireFactory empireFactory = new EmpireFactory();

        empireFactory.createTable().createProduct();
        empireFactory.createSofa().createProduct();
        empireFactory.createChair().createProduct();

        System.out.println("\nАмпір продукти створення\n");

        System.out.println("Створення модерн продуктів\n");

        ModernFactory modernFactory = new ModernFactory();

        modernFactory.createTable().createProduct();
        modernFactory.createSofa().createProduct();
        modernFactory.createChair().createProduct();

        System.out.println("\nМодерн продукти створення");
    }

}
