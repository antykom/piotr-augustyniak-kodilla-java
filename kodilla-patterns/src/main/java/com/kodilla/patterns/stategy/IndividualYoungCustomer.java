package com.kodilla.patterns.stategy;

import com.kodilla.patterns.stategy.predictores.Aggresivepredictor;

public class IndividualYoungCustomer extends Customer{

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new Aggresivepredictor();
    }
}
