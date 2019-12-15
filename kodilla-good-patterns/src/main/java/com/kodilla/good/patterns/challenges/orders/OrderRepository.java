package com.kodilla.good.patterns.challenges.orders;

public interface OrderRepository {

    public void createOrder(User user, Product product, int orderedPieces);
}
