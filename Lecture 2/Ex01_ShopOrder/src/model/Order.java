package model;

import java.util.ArrayList;

public class Order {
    private int orderCode;
    private double orderTotal = 0.00;
    private ArrayList<ItemOrder> orderItens;

    public Order() {
        super();
        orderItens = new ArrayList<>();
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void addItem(ItemOrder item) {
        orderItens.add(item);
        orderTotal += item.getItemQuantity() * item.getItemProduct().getProductValue();
    }

}
