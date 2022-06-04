package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String userName;
    private int rounds;
    private String[] arrayMoves = {"ROCK", "PAPER", "SCISSOR"};

    public Game(String userName, int rounds) {
        this.userName = userName;
        this.rounds = rounds;
    }

    String playGame() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int roundCounter = 1;
        String userMove, compMove, result;
        int userWin = 0;
        int compWin = 0;

        while (roundCounter <= rounds) {
            System.out.print(userName + ", make your move: ");

            userMove = arrayMoves[sc.nextInt()-1];
            compMove = arrayMoves[rnd.nextInt(3)];

            result = compareMove(userMove, compMove);

            if (result.equals("USER")){
                userWin++;
                System.out.println("User win");
            } else if (result.equals("COMP")) {
                compWin++;
                System.out.println("Comp win");
            }

            roundCounter++;
        }

        if(userWin > compWin) {
            return userName;
        }
        else if (userWin < compWin) { return "COMPUTER";

        }
        return "DRAW";
    }

    String compareMove(String userMove, String compMove) {

        if (userMove.equals("ROCK") && compMove.equals("PAPER")) {
            return "COMP";
        } else if (userMove.equals("ROCK") && compMove.equals("SCISSOR")) {
            return "USER";
        } else if (userMove.equals("PAPER") && compMove.equals("ROCK")) {
            return "USER";
        } else if (userMove.equals("PAPER") && compMove.equals("SCISSOR")) {
            return "COMP";
        } else if (userMove.equals("SCISSOR") && compMove.equals("PAPER")) {
            return "USER";
        } else if (userMove.equals("SCISSOR") && compMove.equals("ROCK")) {
            return "COMP";
        }
        return "DRAW";
    }
}
