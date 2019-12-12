package com.kodilla.good.patterns.challenges.orders;

public class OrdersProcessor {

    private OrderConfirmation orderConfirmation;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;
    private UserOrder userOrder;

    public OrdersProcessor(OrderConfirmation orderConfirmation, ProductOrderService productOrderService, OrderRepository orderRepository, UserOrder userOrder) {
        this.orderConfirmation = orderConfirmation;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
        this.userOrder = userOrder;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.productOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedPieces());

        if (isOrdered) {

            orderConfirmation.sendConfirmation(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderedPieces());
            userOrder.addProductToOrder(orderRequest.getProduct(), orderRequest.getOrderedPieces());

            System.out.println("Product ordered. DTO created");

            return new OrderDto(orderRequest.getUser(), true);

        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
