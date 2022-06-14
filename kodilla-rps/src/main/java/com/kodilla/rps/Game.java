package com.kodilla.rps;

import java.util.*;

public class Game {
    private final String userName;
    private final int rounds;
    private final String[] arrayMoves = {"ROCK", "PAPER", "SCISSOR"};
    private final String ROCK = arrayMoves[0];
    private final String PAPER = arrayMoves[1];
    private final String SCISSOR = arrayMoves[2];
    private final String USER = "USER";
    private final String COMP = "COMP";
    private final List<Integer> allowedUserMoves = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    public Game(String userName, int rounds) {
        this.userName = userName;
        this.rounds = rounds;
        this.allowedUserMoves.add(1);
        this.allowedUserMoves.add(2);
        this.allowedUserMoves.add(3);
    }


    String playGame() {
        String userMove, compMove, result;
        int roundCounter = 1;
        int userWinCounter = 0;
        int compWinCounter = 0;

        while (roundCounter <= rounds) {
            System.out.print(userName + ", make your move: ");

            userMove = arrayMoves[userMoveVerify(sc.nextInt()) - 1];
            compMove = arrayMoves[rnd.nextInt(3)];
            System.out.print(userName + " played: " + userMove.toUpperCase() + ", Computer played: "
                    + compMove.toUpperCase() + ". ");

            result = compareMove(userMove, compMove);

            if (result.equals(USER)) {
                userWinCounter++;
                System.out.print(userName + " won. ");
            } else if (result.equals(COMP)) {
                compWinCounter++;
                System.out.print("Computer won. ");
            } else {
                System.out.print("It was a draw. ");
            }

            System.out.println(userName + " " + userWinCounter + ":" + compWinCounter + " Computer");
            roundCounter++;
        }

        return (userWinCounter > compWinCounter ? userName :
                userWinCounter < compWinCounter ? "COMPUTER" : "NO ONE");
    }

    String compareMove(String userMove, String compMove) {

        if (userMove.equals(ROCK) && compMove.equals(PAPER)) {
            return COMP;
        } else if (userMove.equals(ROCK) && compMove.equals(SCISSOR)) {
            return USER;
        } else if (userMove.equals(PAPER) && compMove.equals(ROCK)) {
            return USER;
        } else if (userMove.equals(PAPER) && compMove.equals(SCISSOR)) {
            return COMP;
        } else if (userMove.equals(SCISSOR) && compMove.equals(PAPER)) {
            return USER;
        } else if (userMove.equals(SCISSOR) && compMove.equals(ROCK)) {
            return COMP;
        }
        return "DRAW";
    }

    int userMoveVerify(int i) {
        while (!allowedUserMoves.contains(i)) {
            System.out.print("Wrong number. Try one more time: ");
            i = sc.nextInt();
        }
        return i;
    }

    void instruction() {
        System.out.println("----------- GAME INSTRUCTION ----------");
        System.out.println("Press 1, if you want play ROCK\n" +
                "Press 2, if you want play PAPER\n" +
                "Press 3, if you want play SCISSORS\n" +
                "Press x, if you want stop playing game\n" +
                "Press n, if you want play one more time");
        System.out.println("---------------------------------------");
    }
}
