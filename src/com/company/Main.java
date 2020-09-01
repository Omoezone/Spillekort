package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cardDeck = new ArrayList<>();
        Card deck = new Card(cardDeck);
        deck.shuffleCard(deck);
        System.out.println(cardDeck.size());
        System.out.println(cardDeck);
        playGame(deck);
    }
    public static void playGame(Card cardDeck){
        Random ran = new Random();
        int randomChoise = 0;
        int player1 = 0; int player2 = 0;
        String player1S = ""; String player2S = "";
        for(int i = 0; i < 26; i++){
            randomChoise = ran.nextInt(cardDeck.getCardGame().size()-1);
            cardDeck.getCardGame().remove(randomChoise);
            player1S = cardDeck.getCardGame().get(randomChoise);

            randomChoise = ran.nextInt(cardDeck.getCardGame().size()-1);
            cardDeck.getCardGame().remove(randomChoise);
            player2S = cardDeck.getCardGame().get(randomChoise);

            System.out.println(player1S.compareTo(player2S));

        }
    }
}
