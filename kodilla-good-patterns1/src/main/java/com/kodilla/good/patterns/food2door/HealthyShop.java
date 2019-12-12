package com.kodilla.good.patterns.food2door;

public class HealthyShop implements SupplierOrderProcessor {

    private Supplier supplier = new Supplier("HealthyShop", 9876);

    public Supplier getSupplier() {
        return supplier;
    }


    @Override
    public boolean SupplierOrderProcess(OrderRequest orderRequest) {
        /*
        if (checkProductAmount(orderRequest.getProduct(), orderRequest.getQuantity())) {
            System.out.println("Potwierdzamy przyjęcie zamówienia -> " + orderRequest.getProduct() + " " + orderRequest.getAmount() + "szt |" + orderRequest.getData() );
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
