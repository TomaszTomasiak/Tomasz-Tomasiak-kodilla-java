package com.kodilla.good.patterns.challenges.orders;

public class OrdersProcessor implements OrderConfirmation, ProductOrderService, OrderRepository {


    private UserOrder userOrder;

    public OrdersProcessor(UserOrder userOrder) {
        this.userOrder = userOrder;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedPieces());

        if (isOrdered) {

            sendConfirmation(orderRequest.getUser());
            createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedPieces());
            userOrder.addProductToOrder(orderRequest.getProduct(), orderRequest.getOrderedPieces());

            System.out.println("Product ordered. DTO created");

            return new OrderDto(orderRequest.getUser(), true);

        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

    @Override
    public void sendConfirmation(User user) {
        System.out.println("Confirmation sent");
    }

    @Override
    public void createOrder(User user, Product product, int orderedPieces) {
        System.out.println("Order created");
    }
}
