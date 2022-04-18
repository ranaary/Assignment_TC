/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

/**
 *
 * @author ranaa
 */
public class Players {
   
    private String name;
    private int score;
    private int cardLeft;
    
    public Players() {
    }

    public Players(String name) {
        this.name = name;
        this.score = 0;
        this.cardLeft = 26;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCardLeft() {
        return cardLeft;
    }

    public void setCardLeft(int cardLeft) {
        this.cardLeft = cardLeft;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", score=" + score + ", cardLeft=" + cardLeft + '}';
    }
    
    

}
