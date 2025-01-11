package model.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double totalPrice(double price, int quantity)
    {
        return price*quantity;
    }

    @Override
    public String toString() {
        return getName() + ", " + String.format("%.2f", totalPrice(price,quantity)) + "\n";
    }
}
