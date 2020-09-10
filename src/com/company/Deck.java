package com.company;

import java.util.Collections;
import java.util.Stack;

public class Deck{
    private Stack<Card> deck;

    Deck(){
        deck = new Stack<>();
        initialise();
    }
    void initialise(){
            for(Trumf a : Trumf.values()){
                for(Type b : Type.values()){
                    deck.push(new Card(b,a));
                    System.out.println(a + " " + b);
                }
            }
            shuffle();
    }
    void shuffle(){
        Collections.shuffle(deck);
    }
    Card draw(){
       return deck.pop();
    }
    void cheating(){
        deck.peek();
    }
    int deckSize(){
        return deck.size();
    }

    @Override
    public String toString() {
        return "deck: " + deck;
    }
}
