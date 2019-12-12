package com.kodilla.good.patterns.challenges.orders;

public class OrderApplication {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrdersProcessor ordersProcessor = new OrdersProcessor(new OrderConfirmation(), new ProductOrderService(), new OrderRepository(), new UserOrder());
        ordersProcessor.process(orderRequest);
    }
}
