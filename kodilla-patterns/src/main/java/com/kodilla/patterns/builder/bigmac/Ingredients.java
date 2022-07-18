package com.kodilla.patterns.builder.bigmac;

public enum Ingredients {
    LETTUCE("LETTUCE"),
    ONION("ONION"),
    BACON("BACON"),
    CUCUMBER("CUCUMBER"),
    CHILLI("CHILLI"),
    PEPPERS("PEPPERS"),
    MUSHROOMS("MUSHROOMS"),
    SHRIMPS("SHRIMPS"),
    CHEESE("CHEESE");

    private String name;

    Ingredients(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
