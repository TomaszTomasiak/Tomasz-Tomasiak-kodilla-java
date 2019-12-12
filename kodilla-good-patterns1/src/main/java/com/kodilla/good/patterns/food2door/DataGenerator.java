package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataGenerator {

    LocalDateTime termOfDelivery = LocalDateTime.of(2019, 12, 31, 12, 00);
    private ArrayList<Product> productsList = new ArrayList<>();
    private ArrayList<Supplier> suppliersList = new ArrayList<>();

    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    HealthyShop healthyShop = new HealthyShop();
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
/*
    Product melon = new Product("Melon", 1234, 5.3, extraFoodShop.getSupplier());
    Product pasta = new Product("Gluten Free Pasta", 2222, 6.8, glutenFreeShop.getSupplier());
    Product toothPaste = new Product("ToothPaste", 3333, 10.25, healthyShop.getSupplier());




    public void generateData() {
        productsList.add(melon);
        productsList.add(pasta);
        productsList.add(toothPaste);

        suppliersList.add(extraFoodShop.getSupplier());
        suppliersList.add(healthyShop.getSupplier());
        suppliersList.add(glutenFreeShop.getSupplier());

    }

    public OrderRequest sampleOrder() {
        User user = new User("Batman", 1234);
        return new OrderRequest(user, melon, 3, termOfDelivery);
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public ArrayList<Supplier> getSuppliersList() {
        return suppliersList;
    }

 */
}
