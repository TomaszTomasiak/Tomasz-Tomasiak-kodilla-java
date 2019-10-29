package com.kodilla.rps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GameRPS extends RpsController {

    public GameRPS() {

        RpsController rpsController = new RpsController();
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        HashMap<String, String> theMap = new HashMap<>();
        theMap.put("1", "paper");
        theMap.put("2", "scissors");
        theMap.put("3", "rock");

        ArrayList<String> theList = new ArrayList<>();
        theList.add("paper");
        theList.add("paper");
        theList.add("scissors");
        theList.add("rock");

        boolean end = false;

        System.out.println("Paper, Scissors, Rock - Welcome to the game");
        rpsController.setPlayersName();

        while (!end) {

            rpsController.numberOfPlays();
            System.out.println("You choose name: " + rpsController.playerName);
            System.out.println("We play up to " + rpsController.howManyPlays + " wins");

            while (!end) {
                System.out.println("Select: 1 - paper; 2 - scissors; 3 - stone or X - to close the game; N -to start new game");
                String playerChoice = input.nextLine().toUpperCase();

                if (playerChoice.equals("X")) {
                    System.out.println("Do you realy want to exit the game? Press: Y - yes or N - no");
                    playerChoice = input.nextLine().toUpperCase();

                    if (playerChoice.equals("Y")) {
                        System.out.println("Application is closed");
                        end = true;
                    } else {
                        continue;
                    }

                } else if (playerChoice.equals("N")) {
                    System.out.println("Do you realy want to terminate this game? Press: Y - yes or N - no");
                    playerChoice = input.nextLine().toUpperCase();

                    if (playerChoice.equals("Y")) {
                        rpsController.startFromTheBeginning();
                        break;

                    } else {
                        continue;
                    }

                } else if (playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3")) {

                    System.out.println("Your choice: " + theMap.get(playerChoice));

                    int computerChoice = random.nextInt(3);
                    System.out.println("Computer choice: " + theList.get(computerChoice));

                    if (theList.get(computerChoice).equals("paper") && theMap.get(playerChoice).equals("paper")) {
                        rpsController.draw();

                    } else if (theList.get(computerChoice).equals("scissors") && theMap.get(playerChoice).equals("scissors")) {
                        rpsController.draw();

                    } else if (theList.get(computerChoice).equals("rock") && theMap.get(playerChoice).equals("rock")) {
                        rpsController.draw();

                    } else if (theList.get(computerChoice).equals("paper") && theMap.get(playerChoice).equals("scissors")) {
                        rpsController.playerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }

                    } else if (theList.get(computerChoice).equals("paper") && theMap.get(playerChoice).equals("rock")) {
                        rpsController.computerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }

                    } else if (theList.get(computerChoice).equals("scissors") && theMap.get(playerChoice).equals("paper")) {
                        rpsController.computerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }

                    } else if (theList.get(computerChoice).equals("scissors") && theMap.get(playerChoice).equals("rock")) {
                        rpsController.playerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }

                    } else if (theList.get(computerChoice).equals("rock") && theMap.get(playerChoice).equals("paper")) {
                        rpsController.playerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }

                    } else if (theList.get(computerChoice).equals("rock") && theMap.get(playerChoice).equals("scissors")) {
                        rpsController.computerWin();
                        if (rpsController.computerResult == rpsController.howManyPlays || rpsController.playerResult == rpsController.howManyPlays) {
                            rpsController.gameOver();
                            end = true;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}

