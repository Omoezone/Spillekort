package com.company;

public class Game {
    Deck deck;
    int player1;
    int player2;

    Game(){
        deck = new Deck();
    }
    public void startGame() {
        while (deck.deckSize() > 0) {
            Card card1 = deck.draw();
            System.out.println("Player1: " + card1);
            Card card2 = deck.draw();
            System.out.println("Player2: " + card2);

            if (card1.compareTo(card2) < 0) {
                player2++;
                System.out.println("Round winner: Player 2");
            } else if (card2.compareTo(card1) < 0) {
                player1++;
                System.out.println("Round winner: Player 1");
            } else{
                System.out.println("even steven");
                assert(card1.compareTo(card2) == 0);
            }
            System.out.println("Player1 " + player1 + " - " + player2 + " Player2\n");
        }
        result();
    }
    void result(){
        if(player1 > player2){
            System.out.println("Winner is player1 with a total of |" + player1 + "| points");
        }else if(player1 < player2){
            System.out.println("Winner is player2 with a total of |" + player2 + "| points");
        }else if(player1 == player2){
            System.out.println("It is a draw");
        }
    }
}
