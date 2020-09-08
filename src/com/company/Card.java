package com.company;
import java.util.Collections;
import java.util.Stack;

public class Card extends Deck {
    private Stack cardGame;

    Card(){
        this.cardGame = new Stack();
        shuffleCard();
    }
    public Stack getCardGame() {
        return cardGame;
    }

    public void Stack(Stack stack) {
        this.cardGame = cardGame;
    }
    public int size(){
        int count = 0;
        for(Object card: cardGame){
            count++;
        }
        return count;
    }

    public void shuffleCard(){
        String[] suits = {"Spar","klør","rude","Hjerte"};
        String[] number = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
        for(int i = 0; i < 4; i++){
            for(int h = 0; h < number.length;h++){
                cardGame.push(number[h] + " " + suits[i]);
            }
        }
        Collections.shuffle(cardGame);
    }

    @Override
    public String toString() {
        return "cardGame= " + cardGame;
    }
}
