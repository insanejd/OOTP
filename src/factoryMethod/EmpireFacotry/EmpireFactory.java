package factoryMethod.EmpireFacotry;

import factoryMethod.AbstractFactory;
import factoryMethod.Product;

public class EmpireFactory extends AbstractFactory {

    public EmpireFactory() {
        System.out.println("Створена фабрика ампір продуктів");
    }

    @Override
    public Product createTable() {
        return new EmpireTable();
    }

    @Override
    public Product createChair() {
        return new EmpireChair();
    }

    @Override
    public Product createSofa() {
        return new EmpireSofa();
    }
}
