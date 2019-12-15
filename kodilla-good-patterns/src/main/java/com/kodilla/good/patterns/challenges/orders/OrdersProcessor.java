package com.kodilla.good.patterns.challenges.orders;

public class OrdersProcessor {


    private UserOrder userOrder;
    private OrderConfirmation orderConfirmation;
    private OrderRepository orderRepository;
    private ProductOrderService productOrderService;

    public OrdersProcessor(UserOrder userOrder, OrderConfirmation orderConfirmation, OrderRepository orderRepository, ProductOrderService productOrderService) {
        this.userOrder = userOrder;
        this.orderConfirmation = orderConfirmation;
        this.orderRepository = orderRepository;
        this.productOrderService = productOrderService;
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
