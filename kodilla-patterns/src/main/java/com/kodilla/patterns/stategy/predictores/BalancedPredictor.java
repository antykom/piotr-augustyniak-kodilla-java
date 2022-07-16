package com.kodilla.patterns.stategy.predictores;

import com.kodilla.patterns.stategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
