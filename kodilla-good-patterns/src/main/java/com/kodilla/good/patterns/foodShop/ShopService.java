package com.kodilla.good.patterns.foodShop;

import java.time.LocalDateTime;

public interface ShopService {
    public boolean book(User user, LocalDateTime time);
}
