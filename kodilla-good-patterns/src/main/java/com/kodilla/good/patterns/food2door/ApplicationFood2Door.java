package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ApplicationFood2Door {

    public static void main(String[] args) {

        DataGenerator dataGenerator = new DataGenerator();
        OrderRequest orderRequest = dataGenerator.sampleOrder();

        SupplierOrderProcessor supplier = orderRequest.getProduct().getSupplier();
        OrderProcessor orderProcessor = new OrderProcessor();

        boolean isRealized = orderProcessor.realizeOrder(orderRequest).isRealized();
      }
}
