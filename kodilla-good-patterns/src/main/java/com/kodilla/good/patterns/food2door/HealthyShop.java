package com.kodilla.good.patterns.food2door;

public class HealthyShop implements SupplierOrderProcessor {

    private String supplierName = "Healthy Shop";
    private int supplierID = 2301;

    Logistics logistics = new Logistics();
    DeliveryService deliveryService = new DeliveryService();
    InformationService informationService = new InformationService();
    Accounting accounting = new Accounting();

    @Override
    public String getSupplierName() {
        return supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    @Override
    public boolean supplierOrderProcess(OrderRequest orderRequest) {

        informationService.orderConfirmation(orderRequest);
        deliveryService.sendProcess();
        informationService.informProcessPositive(orderRequest.getProduct().getSupplier());
        accounting.accounting();

        return true;


    }

}

