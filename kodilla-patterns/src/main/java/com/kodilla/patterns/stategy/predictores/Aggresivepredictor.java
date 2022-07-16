package com.kodilla.patterns.stategy.predictores;

import com.kodilla.patterns.stategy.BuyPredictor;

public class Aggresivepredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
