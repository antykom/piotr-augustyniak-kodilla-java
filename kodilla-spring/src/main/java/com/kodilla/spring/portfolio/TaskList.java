package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void add(String s){
        tasks.add(s);
    }

    public void read(){
        tasks.stream().forEach(System.out::println);
    }
}
