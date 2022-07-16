package com.kodilla.patterns.stategy.predictores;

import com.kodilla.patterns.stategy.BuyPredictor;

public class ConservaticePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
