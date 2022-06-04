package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean endGame = false;

        System.out.print("Please, tell my your name: ");
        String name = sc.nextLine();
        System.out.print(name + ", how many rounds do you want play: ");
        int roundsNum = sc.nextInt();


        Game game = new Game(name, roundsNum);

        game.instruction();

        while(!endGame){
            System.out.println("GAME WON BY " + game.playGame());
            System.out.print("If you want stop playing game, press x. Press n, if you want play one more time: ");
            if(sc.next().equals("x")){
                endGame = true;
            }
        }


    }
}
