package model;

public class Product {
    private String productName = "";
    private float productPrice = 0.00f;
    private int productQuantity = 0;

    public Product() {
        super();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        if (productPrice <= 0) {
            System.out.println("Invalid value");
            return;
        }
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        if (productQuantity < 0) {
            System.out.println("Invalid value");
            return;
        }
        this.productQuantity = productQuantity;
    }

    public boolean checkProductStatus() {
        if (productQuantity <= 0) {
            return false;
        }
        return true;
    }

    public float computeTotalValue() {
        return productQuantity * productPrice;
    }

}
