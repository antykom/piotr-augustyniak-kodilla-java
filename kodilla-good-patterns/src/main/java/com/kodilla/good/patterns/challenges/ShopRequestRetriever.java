package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopRequestRetriever {
    public ShopRequest retrieve() {
        User user = new User("John", "p3v4x");
        LocalDateTime orderDate = LocalDateTime.now();

        return new ShopRequest(user, orderDate);
    }
}
