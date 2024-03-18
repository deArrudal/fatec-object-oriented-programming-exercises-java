package view;

import model.ItemOrder;
import model.Order;
import model.Product;

public class Main {
    public static void main(String[] args) {
        // Create products.
        Product product1 = new Product();
        product1.setProductCode(1);
        product1.setProductValue(0.75);
        product1.setProductDescription("Apple");

        Product product2 = new Product();
        product2.setProductCode(2);
        product2.setProductValue(1.45);
        product2.setProductDescription("Chocolate bar");

        Product product3 = new Product();
        product3.setProductCode(3);
        product3.setProductValue(1.10);
        product3.setProductDescription("Pencil");

        // Create new order.
        Order order = new Order();
        order.setOrderCode(1);

        // Add itens to order.
        ItemOrder item1 = new ItemOrder();
        item1.setItemProduct(product1);
        item1.setItemQuantity(3);
        order.addItem(item1);

        ItemOrder item2 = new ItemOrder();
        item2.setItemProduct(product3);
        item2.setItemQuantity(1);
        order.addItem(item2);

        ItemOrder item3 = new ItemOrder();
        item3.setItemProduct(product2);
        item3.setItemQuantity(2);
        order.addItem(item3);

        // Order details.
        System.out.printf("Order: %d\n", order.getOrderCode());
        System.out.printf("Total: %.2f\n", order.getOrderTotal());
    }

}
