package com.kodilla.good.patterns.challenges.orders;

public interface ProductOrderService {

    public default boolean productOrder(final User user, final Product product, int orderedPieces) {
        return true;
    }
}
