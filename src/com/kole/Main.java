package com.kole;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Prvi", calculateHighScorePosition(1500));
        displayHighScorePosition("Drugi", calculateHighScorePosition(900));
        displayHighScorePosition("Treci", calculateHighScorePosition(400));
        displayHighScorePosition("Cetvrti", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition (String playerName, int positionOnHighScoreTable){
        System.out.println(playerName + " managed to get into position " + positionOnHighScoreTable + " on the highscore table!");
    }

    public static int calculateHighScorePosition (int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >=500 && playerScore < 1000){
            return 2;
        } else if (playerScore >=100 && playerScore < 500){
            return 3;
        } else return 4;

    }


}
