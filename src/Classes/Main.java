package Classes;

import java.sql.SQLOutput;

public class Main {
    public static  void checkGameStatus(int score){
        boolean gameOver=true;
        int levelCompleted=5;
        int bonus=100;

        if ((score<5000)&&(score>1000)){
            System.out.println("Your score is in between 1000 and 5000");
        }
        else if(score<1000){
            System.out.println("Your score is less than 1000");
        }
        else{
            System.out.println("Your score is more than 5000");
        }

    }

    private static  int  calcFinalScore(int score, int levelCompleted, int bonus, boolean gameOver) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Final score is: " + finalScore);
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String name, int pos) {
        String playerName = name;
        int playerPosition = pos;
        System.out.println(playerName+" managed to get into position "+ playerPosition +" on the high score list.");
    }

    public static int calculateHighScorePosition(int s){
        int score=s;
        int val;
        if(score>=1000){
            val=1;
        }
        else if ((score>=500) && (score<1000)) {
            val=2;
        }
        else if ((score>=100) && (score<500)) {
            val=3;
        }
        else {
            val=4;
        }
        System.out.println("The result is: "+ val);
        return val;
    }


    public static void main(String[] args) {
/*
       checkGameStatus(100);
        checkGameStatus(1500);
       checkGameStatus(6000);
        calcFinalScore(10000, 8, 200, true);

        boolean g=true;
        int s=800;
        int l=5;
        int b=100;
        System.out.println("The final score is: " +calcFinalScore(s, l, b, g));
*/
        displayHighScorePosition("Kristen", 1);
        calculateHighScorePosition(1500);
        calculateHighScorePosition(1000);
        calculateHighScorePosition(500);
        calculateHighScorePosition(100);
        calculateHighScorePosition(25);
    }
}
