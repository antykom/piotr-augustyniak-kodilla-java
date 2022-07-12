package com.kodilla.good.patterns.foodShop;

import java.time.LocalDateTime;

public class ShopRequest {
    private User user;
    private LocalDateTime orderDate;

    public ShopRequest(User user, LocalDateTime orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
