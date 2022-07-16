package com.kodilla.patterns.stategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share() {
        return "Snapchat post published";
    }
}
