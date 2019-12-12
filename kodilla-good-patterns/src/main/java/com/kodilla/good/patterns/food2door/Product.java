package com.kodilla.good.patterns.food2door;

public class Product {

    private String productName;
    private int productID;
    private double productPrice;
    private Supplier supplier;

    public Product(String productName, int productID, double productPrice, Supplier supplier) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

   public double getProductPrice() {
        return productPrice;
   }

    public Supplier getSupplier() {
        return supplier;
    }
}
