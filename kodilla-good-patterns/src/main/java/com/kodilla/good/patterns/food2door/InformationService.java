package com.kodilla.good.patterns.food2door;

public class InformationService {



    public void orderConfirmation(OrderRequest orderRequest) {

        double amount = orderRequest.getProduct().getProductPrice() * orderRequest.getQuantity();

        System.out.println("Potwierdzenie przyjęcie zamówienia: \n"
                + orderRequest.getProduct() + ",  " + orderRequest.getQuantity() + " szt, " + orderRequest.getTermOfDelivery() + "\nWartość zamówienia: "
                + amount);

    }

    public void deliveryConfirmation() {
        System.out.println("Ordered products delivered");

    }

    public void informProcess(){

    }
}
