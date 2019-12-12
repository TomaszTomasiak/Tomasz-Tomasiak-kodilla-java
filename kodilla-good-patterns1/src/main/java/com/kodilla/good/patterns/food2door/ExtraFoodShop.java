package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements SupplierOrderProcessor {

    private Supplier supplier = new Supplier("ExtraFoodShop", 1234);

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean SupplierOrderProcess(OrderRequest orderRequest) {
/*
        if (checkProductAmount(orderRequest.getProduct(), orderRequest.getQuantity())) {
            System.out.println("Potwierdzamy przyjęcie zamówienia -> " + orderRequest.getProduct() + " " + orderRequest.getQuantity() + "szt |" + orderRequest.getTermOfDelivery() );
            sendProcess();
            informProcess();

            return true;

        } else {
            System.out.println("Nie udało się zrealizować zamówienia..");

            return false;
        }

 */
return true;
    }



    @Override
    public Supplier getSupplierName() {
        return null;
    }
}
