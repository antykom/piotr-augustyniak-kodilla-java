package com.kodilla.patterns.stategy;

import com.kodilla.patterns.stategy.predictores.ConservaticePredictor;

public class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservaticePredictor();
    }
}
