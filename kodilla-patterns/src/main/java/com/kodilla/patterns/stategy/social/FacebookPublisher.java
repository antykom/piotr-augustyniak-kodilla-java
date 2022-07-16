package com.kodilla.patterns.stategy.social;

public class FacebookPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Facebook post published";
    }
}
