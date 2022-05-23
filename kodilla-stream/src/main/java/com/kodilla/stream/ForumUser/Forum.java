package com.kodilla.stream.ForumUser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Jacek", 'M', LocalDate.of(2004,1,1),
                2));
        userList.add(new ForumUser(2,"Marek", 'M', LocalDate.of(2000,12,6),
                45));
        userList.add(new ForumUser(3,"Anna", 'F', LocalDate.of(1995,3,4),
                20));
        userList.add(new ForumUser(4,"Agata", 'F', LocalDate.of(1999,10,30),
                12));
        userList.add(new ForumUser(5,"Jacek", 'M', LocalDate.of(1979,7,10),
                33));
        userList.add(new ForumUser(6,"Dariusz", 'M', LocalDate.of(2002,1,28),
                21));
        userList.add(new ForumUser(7,"Monika", 'F', LocalDate.of(1986,6,6),
                0));
        userList.add(new ForumUser(8,"Wojtek", 'M', LocalDate.of(1990,1,12),
                0));
        userList.add(new ForumUser(9,"Cezary", 'M', LocalDate.of(1990,8,15),
                99));
        userList.add(new ForumUser(10,"Jacek", 'M', LocalDate.of(1985,2,14),
                8));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }

}
