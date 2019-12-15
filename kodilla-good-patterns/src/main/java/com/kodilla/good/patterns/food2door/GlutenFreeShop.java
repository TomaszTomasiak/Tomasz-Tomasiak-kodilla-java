package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements SupplierOrderProcessor {

    private String supplierName = "Gluten Free Shop";
    private int supplierID = 5678;

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
            informationService.informProcessPositive(orderRequest.getProduct().getSupplier());

            return true;

        } else {
            informationService.informProcessNegative(orderRequest.getProduct().getSupplier());

            return false;
        }

    }

}
