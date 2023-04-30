package memento;

public class Order {

    private String name;
    private String[] orders;
    private String tableNumber;

    public Order(String name, String[] orders, String tableNumber) {
        this.name = name;
        this.orders = orders;
        this.tableNumber = tableNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getOrders() {
        return orders;
    }

    public void setOrders(String[] orders) {
        this.orders = orders;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }
}
