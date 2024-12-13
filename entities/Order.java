package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static entities.Post.sdf1;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> pedidos = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item)
    {
        pedidos.add(item);
    }

    public void removeItem(OrderItem item)
    {
        pedidos.remove(item);
    }

    public double total()
    {
        double sum = 0.0;
        for(OrderItem item : pedidos)
        {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ");
        sb.append(sdf1.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");

        for(OrderItem item: pedidos)
        {
            sb.append(item + "\n");
        }
        sb.append("Total Price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }

}
