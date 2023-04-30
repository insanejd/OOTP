package factoryMethod.ModernFactory;

import factoryMethod.AbstractFactory;
import factoryMethod.Product;

public class ModernFactory extends AbstractFactory {

    public ModernFactory() {
        System.out.println("Створена фабрика модерн продуктів");
    }

    @Override
    public Product createTable() {
        return new ModernTable();
    }

    @Override
    public Product createChair() {
        return new ModernChair();
    }

    @Override
    public Product createSofa() {
        return new ModernSofa();
    }
}
