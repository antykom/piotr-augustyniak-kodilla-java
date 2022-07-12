package com.kodilla.good.patterns.foodShop;

import java.time.LocalDateTime;

public interface ShopRepository {
    public void bookProducts(User user, LocalDateTime date);
}
