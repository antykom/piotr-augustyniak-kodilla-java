package com.kodilla.patterns.stategy;

import com.kodilla.patterns.stategy.predictores.BalancedPredictor;

public class CorporateCustomer extends Customer{

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
