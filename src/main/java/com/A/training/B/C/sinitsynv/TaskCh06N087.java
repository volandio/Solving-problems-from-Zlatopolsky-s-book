package com.A.training.B.C.sinitsynv;

import java.util.Scanner;

public class TaskCh06N087 {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}

class Game {
    private String teamFirst;
    private String teamSecond;
    private int scoreFirst;
    private int scoreSecond;

    public Game() {
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter team #1");
        teamFirst = in.next();
        System.out.println("Enter team #2");
        teamSecond = in.next();
        while (true) {
            System.out.println("Enter team to score (1 or 2 or 0 to finish game):");
            int selection = in.nextInt();
            if (selection == 0) {
                System.out.println(result());
                in.close();
                break;
            }
            System.out.println("Enter score (1 or 2 or 3):");
            int score = in.nextInt();
            if (selection == 1) {
                scoreFirst += score;
                System.out.println(score());
            } else if (selection == 2) {
                scoreSecond += score;
                System.out.println(score());
            }
        }
    }

    public String score() {
        return teamFirst + ":" + scoreFirst + " " + teamSecond + ":" + scoreSecond;
    }

    public String result() {
        if (scoreFirst >= scoreSecond) {
            return "Winner " + teamFirst + "=" + scoreFirst + " : " + "Looser " + teamSecond + "=" + scoreSecond;
        } else {
            return "Winner " + teamSecond + "=" + scoreSecond + " : " + "Looser " + teamFirst + "=" + scoreFirst;
        }
    }

    public void setTeamFirst(String teamFirst) {
        this.teamFirst = teamFirst;
    }

    public void setTeamSecond(String teamSecond) {
        this.teamSecond = teamSecond;
    }

    public void setScoreFirst(int scoreFirst) {
        this.scoreFirst = scoreFirst;
    }

    public void setScoreSecond(int scoreSecond) {
        this.scoreSecond = scoreSecond;
    }
}
