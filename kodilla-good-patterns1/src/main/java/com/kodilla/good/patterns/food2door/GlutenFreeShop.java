package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements SupplierOrderProcessor {

    private Supplier supplier = new Supplier("GlutenFreeShop", 4561);

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean SupplierOrderProcess(OrderRequest orderRequest) {
        System.out.println("Przekazano do procesowania");
       /*
        if (checkProductAmount(orderRequest.getProduct(), orderRequest.getQuantity())) {
            System.out.println("Potwierdzamy przyjęcie zamówienia -> " + orderRequest.getProduct().getName() + " | " + orderRequest.getAmount() + "szt |" + orderRequest.getData());
            sendProcess();
            informProcess();

            return true;

        } else  {
            System.out.println("Nie udało się zrealizować zamówienia z powodu braku towaru..");

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
