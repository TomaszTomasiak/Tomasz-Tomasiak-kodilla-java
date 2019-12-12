package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataGenerator {

    LocalDate termOfDelivery = LocalDate.of(2019, 12, 31);
    private ArrayList<Product> productsList = new ArrayList<>();
    private ArrayList<Supplier> suppliersList = new ArrayList<>();

    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    HealthyShop healthyShop = new HealthyShop();
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

    Supplier EFS = new Supplier(extraFoodShop.getSupplierName(), extraFoodShop.getSupplierID());
    Supplier HS = new Supplier(healthyShop.getSupplierName(), healthyShop.getSupplierID());
    Supplier GFS = new Supplier(glutenFreeShop.getSupplierName(), glutenFreeShop.getSupplierID());

    Product melon = new Product("Melon", 1234, 5.3, EFS);
    Product pasta = new Product("Gluten Free Pasta", 2222, 6.8, GFS);
    Product toothPaste = new Product("ToothPaste", 3333, 10.25, HS);


    public void generateData() {
        productsList.add(melon);
        productsList.add(pasta);
        productsList.add(toothPaste);

        suppliersList.add(EFS);
        suppliersList.add(HS);
        suppliersList.add(GFS);
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


}
