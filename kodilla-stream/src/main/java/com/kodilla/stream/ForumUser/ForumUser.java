package com.kodilla.stream.ForumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userBirth;
    private final int postQuantity;

    public ForumUser(final int userID, final String userName, final char userSex, final LocalDate userBirth,
                     final int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirth = userBirth;
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirth=" + userBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
