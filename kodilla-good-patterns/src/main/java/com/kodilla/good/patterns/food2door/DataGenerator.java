package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataGenerator {

    LocalDate termOfDelivery = LocalDate.of(2019, 12, 31);
    private ArrayList<Product> productsList = new ArrayList<>();
    private ArrayList<SupplierOrderProcessor> suppliersList = new ArrayList<>();

    SupplierOrderProcessor extraFoodShop = new ExtraFoodShop();
    SupplierOrderProcessor healthyShop = new HealthyShop();
    SupplierOrderProcessor glutenFreeShop = new GlutenFreeShop();
    SupplierOrderProcessor newShop = new NewShop("New Shop", 9999);

    Product melon = new Product("Melon", 1234, 5.3, extraFoodShop);
    Product pasta = new Product("Gluten Free Pasta", 2222, 6.8, glutenFreeShop);
    Product toothPaste = new Product("ToothPaste", 3333, 10.25, healthyShop);
    Product toothPaste2 = new Product("ToothPaste", 3333, 10.25, newShop);


    public void generateData() {
        productsList.add(melon);
        productsList.add(pasta);
        productsList.add(toothPaste);
        productsList.add(toothPaste2);

        suppliersList.add(extraFoodShop);
        suppliersList.add(healthyShop);
        suppliersList.add(glutenFreeShop);
        suppliersList.add(newShop);
    }

    public OrderRequest sampleOrder() {
        User user = new User("Batman", 1234);
        return new OrderRequest(user, melon, 3, termOfDelivery);
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public ArrayList<SupplierOrderProcessor> getSuppliersList() {
        return suppliersList;
    }


}
