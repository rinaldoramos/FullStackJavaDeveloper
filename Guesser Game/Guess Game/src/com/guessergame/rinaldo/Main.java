package com.guessergame.rinaldo;

import java.util.Scanner;

class Guesser {

    int guessNum;

    int getGuessNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guesser, kindly try to guess the number:");
        guessNum = scanner.nextInt();
        return guessNum;
    }
}

class Player {

    int guessNum;

    int getGuessNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player, kindly try to guess the number:");
        guessNum = scanner.nextInt();
        return guessNum;
    }
}

class Umpire {

    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;

    void collectNumFromGuesser() {

        Guesser guesser = new Guesser();
        numberFromGuesser = guesser.getGuessNum();
    }

    void collectNumFromPlayers() {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        numberFromPlayer1 = player1.getGuessNum();
        numberFromPlayer2 = player2.getGuessNum();
        numberFromPlayer3 = player3.getGuessNum();
    }

    void compare() {

        if (numberFromGuesser == numberFromPlayer1) {
            System.out.println("Player 1 won the game");
        } else if (numberFromGuesser == numberFromPlayer2) {
            System.out.println("Player 2 won the game");
        } else if (numberFromGuesser == numberFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost! Try Again!");
        }
    }
}

public class Main {

    public static void main(String[] args) {


        System.out.println("=======================================================================================================================");
        System.out.println("GUESSER GAME");
        System.out.println("=======================================================================================================================");


        System.out.println("How many players will be playing:");
        /*Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayers();
        umpire.compare();*/
    }

}
