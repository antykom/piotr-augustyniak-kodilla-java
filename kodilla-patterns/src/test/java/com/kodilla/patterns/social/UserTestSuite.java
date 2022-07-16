package com.kodilla.patterns.social;

import com.kodilla.patterns.stategy.Customer;
import com.kodilla.patterns.stategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike Belmondo");
        User ann = new YGeneration("Ann Patton");
        User steve = new ZGeneration("Steve Jobs");

        //When
        String mikeShare = mike.sharePost();
        System.out.println("Mike shared: " + mikeShare);
        String annShare = ann.sharePost();
        System.out.println("Ann shared: " + annShare);
        String steveShare = steve.sharePost();
        System.out.println("Steve shared: " + steveShare);

        //Then
        assertEquals("Facebook post published", mikeShare);
        assertEquals("Twitter post published", annShare);
        assertEquals("Snapchat post published", steveShare);
    }


    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike Belmondo");

        //When
        String mikeShare = mike.sharePost();
        System.out.println("Mike shared: " + mikeShare);
        mike.setSocialPublisher(new SnapchatPublisher());
        mikeShare = mike.sharePost();
        System.out.println("Mike shared: " + mikeShare);

        //Then
        assertEquals("Snapchat post published", mikeShare);
    }
}
