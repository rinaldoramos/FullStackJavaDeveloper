package com.guessergame.rinaldo;

import java.util.Scanner;

class Guesser {
    int guesserNumber;

    int getGuesserNumber(Scanner scanner) {
        boolean correctNumber = false;

        while (!correctNumber) {
            System.out.println("Guesser, please provide a number between 1 - 10 only...");
            int numberGiven = scanner.nextInt();
            if (numberGiven > 0 && numberGiven < 11) {
                correctNumber = true;
                guesserNumber = numberGiven;
            } else {
                System.out.println("Incorrect value! Please try again!");
            }
        }

        return guesserNumber;
    }
}

class Player {
    int playerNumber;

    public int getPlayerNumber(Scanner scanner, int numberOfPlayer) {
        boolean correctNumber = false;

        while (!correctNumber) {
            System.out.println("Player " + numberOfPlayer + ", please provide a number between 1 - 10 only...");
            int numberGiven = scanner.nextInt();
            if (numberGiven > 0 && numberGiven < 11) {
                correctNumber = true;
                playerNumber = numberGiven;
            } else {
                System.out.println("Incorrect value! Please try again!");
            }
        }
        return playerNumber;
    }
}

class Umpire{

    int numberFromTheGuesser;
    int numberFromThePlayer1;
    int numberFromThePlayer2;
    int numberFromThePlayer3;
    Scanner scanner = new Scanner(System.in);
    void collectNumFromGuesser() {
        Guesser guesser = new Guesser();
        numberFromTheGuesser = guesser.getGuesserNumber(scanner);
    }

    void collectNumFromPlayer1() {
        Player player1 = new Player();
        numberFromThePlayer1 = player1.getPlayerNumber(scanner, 1);
    }
    void collectNumFromPlayer2() {
        Player player1 = new Player();
        numberFromThePlayer2 = player1.getPlayerNumber(scanner, 2);
    }
    void collectNumFromPlayer3() {
        Player player1 = new Player();
        numberFromThePlayer3 = player1.getPlayerNumber(scanner, 3);
    }
}

public class Main {

    public static void tittleGame() {
        int n = 7;

        System.out.println("===================================================================================================================================");
        for (int i = 0; i < n ; i++) {
            System.out.print(" ");

            // letter G
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0) || (j == 0 && i != 0 && i != n - 1) || (i == n - 1 && j != 0) ||
                        (i == (n - 1) / 2 && j >= (n - 1) / 2) || j == n - 1 && i >= (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter U
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n -1) && i != n -1 || (i == n -1) && j != 0 && j != n -1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter E
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || i == (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter S
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0) || (i == (n - 1) / 2) && j != 0 && j != n - 1 || (i == n - 1) && j != n - 1
                        || j == 0 && (i > 0 && i < (n - 1) / 2) || j == n - 1 && (i > (n - 1) / 2 && i < n - 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter S
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0) || (i == (n - 1) / 2) && j != 0 && j != n - 1 || (i == n - 1) && j != n - 1
                        || j == 0 && (i > 0 && i < (n - 1) / 2) || j == n - 1 && (i > (n - 1) / 2 && i < n - 1)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter E
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || i == (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter R
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == (n - 1) / 2) && j != n - 1
                        || j == 0 || j == n - 1 && (i > 0 && i < (n - 1) / 2)
                        || (i == j && i >= (n - 1) / 2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("                             ");

            // letter G
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0) || (j == 0 && i != 0 && i != n - 1) || (i == n - 1 && j != 0) ||
                        (i == (n - 1) / 2 && j >= (n - 1) / 2) || j == n - 1 && i >= (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter A
            for (int j = 0; j < n; j++) {
                if (i == 0 && (j >= n / 4 && j <= (3 * n) / 4) || j == ((n / 4) - 1) && i > 0 || j == ((3 * n) / 4 + 1) && i > 0
                        || i == (n - 1) / 2 && (j >= n / 4 && j <= (3 * n) / 4)){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j && i <= (n - 1) / 2 || i + j == n - 1 && i <= (n - 1) / 2) {

                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // letter E
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || i == (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println("===================================================================================================================================");
    }

    public static void main(String[] args) {

        // title here
        tittleGame();
        System.out.println();
        System.out.println();

        Umpire umpire = new Umpire();
        Scanner scanner = new Scanner(System.in);
        boolean winnerFound = false;

        do {

            System.out.println("Please choose from the options:");
            System.out.println("1- to play the game");
            System.out.println("2- to quit the game");
            int value = scanner.nextInt();

            switch (value) {

                case 1:
                    // get guesser number
                    umpire.collectNumFromGuesser();

                    // get players numbers
                    umpire.collectNumFromPlayer1();
                    umpire.collectNumFromPlayer2();
                    umpire.collectNumFromPlayer3();

                    while (true) {
                        if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer3) {
                            System.out.println("no winner in this match!");
                            break;
                        } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                            System.out.println("All players tie!");
                            break;
                        } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                            if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                // tie p1 and p2
                                System.out.println("Both players 1 and 2 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer1();
                                    umpire.collectNumFromPlayer2();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer2) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                        System.out.println("Player 1 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 2 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                // tie p1 and p3
                                System.out.println("Both players 1 and 3 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer1();
                                    umpire.collectNumFromPlayer3();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer3) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                        System.out.println("Player 1 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 3 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Player 1 won the game!");
                                winnerFound = true;
                                break;
                            }
                        } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                            if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                // tie p2 and p1
                                System.out.println("Both players 2 and 1 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer1();
                                    umpire.collectNumFromPlayer2();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer2) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                        System.out.println("Player 1 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 2 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                // tie p2 and p3
                                System.out.println("Both players 2 and 3 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer2();
                                    umpire.collectNumFromPlayer3();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer3) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                        System.out.println("Player 2 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 3 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Player 2 won the game");
                                winnerFound = true;
                                break;
                            }
                        } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                            if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                // tie p3 and p2
                                System.out.println("Both players 2 and 3 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer2();
                                    umpire.collectNumFromPlayer3();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer3) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer2) {
                                        System.out.println("Player 2 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 3 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                // tie p1 and p3
                                System.out.println("Both players 3 and 1 tie. They will need to guess again.");
                                while (true) {
                                    umpire.collectNumFromGuesser();
                                    umpire.collectNumFromPlayer1();
                                    umpire.collectNumFromPlayer3();

                                    if (umpire.numberFromTheGuesser != umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser != umpire.numberFromThePlayer3) {
                                        System.out.println("No winner as well!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1 && umpire.numberFromTheGuesser == umpire.numberFromThePlayer3) {
                                        System.out.println("Both players tie again!");
                                    } else if (umpire.numberFromTheGuesser == umpire.numberFromThePlayer1) {
                                        System.out.println("Player 1 won finally won!!");
                                        winnerFound = true;
                                        break;
                                    } else {
                                        System.out.println("Player 3 finally won!!");
                                        winnerFound = true;
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Player 3 won the game");
                                winnerFound = true;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exiting the game...");
                    System.exit(0);
                default:
                    System.out.println("value enter is not correct. Please try again");
            }

        } while (!winnerFound);

    }
}
