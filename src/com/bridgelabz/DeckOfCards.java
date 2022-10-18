package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {

    public void cardDistribution() {
        Random random = new Random();
        String[] suit = {"Clubs","Diamond","Hearts","Spades"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int suitNum;
        int rankNum;

        String[][] distributed = new String[9][1];

            for (int a = 0; a < distributed.length; a++) {
                for (int b = 0; b < distributed[a].length; b++) {
                    suitNum = random.nextInt(4);
                    rankNum = random.nextInt(13);
                    distributed[a][b] = suit[suitNum] + " " + rank[rankNum];
                }
            }
            for (int a = 0; a < distributed.length; a++) {
                for (int b = 0; b < distributed[a].length; b++) {
                    System.out.println(distributed[a][b] + " ");
                }
                System.out.println();
            }
    }
}

class Result {
    public static void main(String[] args) {
        DeckOfCards player1 = new DeckOfCards();
        DeckOfCards player2 = new DeckOfCards();
        DeckOfCards player3 = new DeckOfCards();
        DeckOfCards player4 = new DeckOfCards();
        System.out.println("Card for Player 1 ");
        player1.cardDistribution();
        System.out.println("Card for Player 2 ");
        player2.cardDistribution();
        System.out.println("Card for Player 3 ");
        player3.cardDistribution();
        System.out.println("Card for Player 4 ");
        player4.cardDistribution();
    }
}
