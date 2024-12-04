package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtores
    public Product(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga (construtores diferentes pro mesmo objeto)
    public Product(String name,double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    //Getters e setters
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    //end getset

    //Métodos
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
