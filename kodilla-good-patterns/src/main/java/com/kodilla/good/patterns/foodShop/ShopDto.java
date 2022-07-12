package com.kodilla.good.patterns.foodShop;

public class ShopDto {
    private User user;
    private boolean inStock;

    public ShopDto(final User user, final boolean inStock) {
        this.user = user;
        this.inStock = inStock;
    }

    public User getUser() {
        return user;
    }

    public boolean inStock() {
        return inStock;
    }
}

