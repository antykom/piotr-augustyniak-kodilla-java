package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ShopService {
    public boolean rent(User user, LocalDateTime time);
}
