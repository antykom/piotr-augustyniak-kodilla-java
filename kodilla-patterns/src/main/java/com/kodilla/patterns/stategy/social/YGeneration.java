package com.kodilla.patterns.stategy.social;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
