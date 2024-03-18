package model;

public class ItemOrder {
    private Product itemProduct;
    private int itemQuantity = 0;

    public ItemOrder() {
        super();
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Product getItemProduct() {
        return itemProduct;
    }

    public void setItemProduct(Product itemProduct) {
        this.itemProduct = itemProduct;
    }

}
