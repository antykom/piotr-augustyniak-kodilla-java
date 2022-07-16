package com.kodilla.patterns.stategy.social;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Twitter post published";
    }
}
