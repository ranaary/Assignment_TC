/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

/**
 *
 * @author roopamjit
 */
public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;
    private int value;
    

    public Card() {
        super();
    }

    public Card(Suit suit, Rank rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        

    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

// get winner s card
    public static Card getWinnerCard(Card card1, Card card2, int comparable) {
        if (comparable == -1) {
            return card1;
        }
        if (comparable == 1) {
            return card2;
        } else {
            return null;
        }
    }
// print the card suit
    @Override
    public String toString() {
        return "Cards{ "
                + "suit=" + suit
                + ", rank=" + rank
                + ", value=" + value
                + " }";
    }
    
// compare the cards
    @Override
    public int compareTo(Card card) {
        if (this.value > card.value) {
            return -1;
        }
        if (this.value < card.value) {
            return 1;
        } else {
            return 0;
        }
    }

   

}
