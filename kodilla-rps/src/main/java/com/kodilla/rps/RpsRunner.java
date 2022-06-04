package com.kodilla.rps;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, tell my your name: ");
        String name = sc.nextLine();
        System.out.print(name + ", how many rounds do you want play: ");
        int roundsNum = sc.nextInt();

        System.out.println("----- GAME INSTRUCTION -----");
        System.out.println("Press 1, if you want play ROCK");
        System.out.println("Press 2, if you want play PAPER");
        System.out.println("Press 3, if you want play SCISSORS");
        System.out.println("Press x, if you want stop playing game");
        System.out.println("Press n, if you want play one more time");

        Game game = new Game(name, roundsNum);
        System.out.println("Games win by " + game.playGame());;

    }
}
