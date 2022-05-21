package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.List;

public class AnalysisOfStatistics {
    private Statistics statistics;
    private int numUsers;
    private int numPosts;
    private int numComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public AnalysisOfStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numUsers = statistics.usersNames().size();
        numPosts = statistics.postsCount();
        numComments = statistics.commentsCount();
        if (numUsers != 0) {
            if (numPosts != 0) {
                postsPerUser = (double) numPosts / numUsers;
                commentsPerUser = (double) numComments / numUsers;
                commentsPerPost = (double) numComments / numPosts;
            }
        }

    }

    public double getPostsPerUser() {
        calculateAdvStatistics(statistics);
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        calculateAdvStatistics(statistics);
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        calculateAdvStatistics(statistics);
        return commentsPerPost;
    }
}
