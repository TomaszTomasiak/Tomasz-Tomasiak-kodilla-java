package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements SupplierOrderProcessor {

    private String supplierName = "Extra Food Shop";
    private int supplierID = 1234;

    Logistics logistics = new Logistics();
    DeliveryService deliveryService = new DeliveryService();
    InformationService informationService = new InformationService();

    @Override
    public String getSupplierName() {
        return supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    @Override
    public boolean supplierOrderProcess(OrderRequest orderRequest) {

        if (logistics.checkStock(orderRequest.getProduct(), orderRequest.getQuantity())) {

            informationService.orderConfirmation(orderRequest);
            deliveryService.sendProcess();
            informationService.informProcess();

            return true;

        } else {
            System.out.println("Zlecenie nie może być zrealizowane. Produkt:  " + orderRequest.getProduct().getProductName() + ": out of stock");

            return false;
        }
    }
}
