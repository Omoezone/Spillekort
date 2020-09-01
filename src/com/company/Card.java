package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Card extends Deck {
    private ArrayList<String> cardGame;

    Card(ArrayList<String> cardGame){
        this.cardGame = cardGame;
    }

    public ArrayList<String> getCardGame() {
        return cardGame;
    }

    public void setCardGame(ArrayList<String> cardGame) {
        this.cardGame = cardGame;
    }

    Card shuffleCard(Card card){
        //ArrayList<String> temp = new ArrayList<>();
        String[] suits = {"Spar","klør","rude","Hjerte"};
        String[] number = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
        for(int i = 0; i < 4; i++){
            for(int h = 0; h < number.length;h++){
                card.getCardGame().add(number[h] + " " + suits[i]);
            }
        }
        Collections.shuffle(card.getCardGame());
        return card;
    }

}
