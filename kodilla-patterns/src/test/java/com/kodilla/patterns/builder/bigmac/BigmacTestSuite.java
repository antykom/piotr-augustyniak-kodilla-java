package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("With seasam")
                .burgers(2)
                .sauce("standard")
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.MUSHROOMS)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}
