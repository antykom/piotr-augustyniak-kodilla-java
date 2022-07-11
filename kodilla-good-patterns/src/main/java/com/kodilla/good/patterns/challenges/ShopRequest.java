package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopRequest {

    private User user;
    private LocalDateTime orderDate;

    public ShopRequest(final User user, final LocalDateTime orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() { return user; }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
