package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime termOfDelivery;

    public OrderRequest(User user, Product product, int quantity, LocalDateTime termOfDelivery) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.termOfDelivery = termOfDelivery;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTermOfDelivery() {
        return termOfDelivery;
    }
}
