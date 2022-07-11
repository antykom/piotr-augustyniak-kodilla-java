package com.kodilla.good.patterns.challenges;

public class ShopDTo {

    private User user;
    private boolean inStock;

    public ShopDTo(final User user, final boolean inStock) {
        this.user = user;
        this.inStock = inStock;
    }

    public User getUser() { return user; }

    public boolean inStock() { return inStock; }
}
