package com.bridge.deckOfCards;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] totalCards = new String[52];
        int start = 0, end = 52, v = 0;


//        public String toString () {
//            String s = "";
//            int k;
//            k = 0;
//            for (int i = 0; i < 4; i++) {
//                for (int j = 1; j <= 13; j++)
//                    s += (totalCards[k++] + " ");
//
//            }
//        }
//        int k = 0;
//        for (int i = 0; i < 4; i++) {
//            System.out.print("For Player " + i + ": \n");
//            for (int j = 0; j < 9; j++) {
//
//                System.out.print(totalCards[k] + "->");
//                k++;
//            }
//            System.out.println();
//        }


        for (int i = 0; i < 4; i++) {
            for (int j = start; j <= end; j++) {
                totalCards[i] = suits[i] + " " + numbers[v];
                v++;
            }
        }
    }
}


