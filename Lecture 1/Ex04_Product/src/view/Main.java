package view;

import model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Ms.Geller's Apple pie");

        product.setProductPrice(0);
        product.setProductPrice(12.75f);

        product.setProductQuantity(-1);
        product.setProductQuantity(10);

        System.out.printf("Product: %s\n", product.getProductName());
        System.out.printf("Quantity: %d\n", product.getProductQuantity());
        System.out.printf("Quantity: %.2f\n", product.getProductPrice());

        System.out.printf("Status: %s\n",
                product.checkProductStatus() ? "Available" : "Out of Stock");

        System.out.printf("Stock Total: U$:%.2f\n", product.computeTotalValue());

    }

}
