/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author roopamjit
 */


public class Deck {

    private ArrayList<Card> deck;
    private int topCard;
    private Players player;

    public Deck(Players player) {
        this.player = player;
        topCard = 0;
        deck = new ArrayList<>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    public void setTopCard(int topCard) {
        this.topCard = topCard;
    }

    public int getTopCard() {
        return topCard;
    }

    public Card dealTopCard() {
        Card card;
        if (topCard >= deck.size()) {
            topCard = 0;
        }

        int temp = topCard;
        topCard++;

        card = deck.get(temp);

        return card;
    }

    public void addCard(Card card) {
        this.player.setCardLeft(this.player.getCardLeft() + 1);
        this.player.setScore(this.player.getScore() + 1);
        this.deck.add(card);
        // System.out.println("Add Card: " + this.player.toString());
    }

    public void removeCard(Card card) {
        this.player.setCardLeft(this.player.getCardLeft() - 1);
        this.deck.remove(card);
        // System.out.println("Remove Card: " + this.player.toString());

    }

    public static void shuffle(ArrayList<Card> deck) {
        Collections.shuffle(deck);
    }

    public static ArrayList<Card> createDeck() {
        ArrayList<Card> myDeck = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            switch (i) {
                case 1:
                    i = 2;
                    for (Rank value : Rank.values()) {
                        Card card = new Card(Suit.Hearts, value, i);

                        myDeck.add(card);
                        i++;
                    }
                    i = 2;
                case 15:
                    for (Rank value : Rank.values()) {
                        Card card = new Card(Suit.Diamonds, value, i);

                        myDeck.add(card);
                        i++;
                    }
                    i = 2;
                case 30:
                    for (Rank value : Rank.values()) {
                        Card card = new Card(Suit.Clubs, value, i);

                        myDeck.add(card);
                        i++;
                    }
                    i = 2;
                case 45:
                    for (Rank value : Rank.values()) {
                        Card card = new Card(Suit.Spades, value, i);

                        myDeck.add(card);
                        i++;
                    }
                    i = 2;

            }

        }
        return myDeck;
    }

}

