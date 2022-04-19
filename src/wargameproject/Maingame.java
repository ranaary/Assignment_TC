/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wargameproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ranaa
 */
public class Maingame {
    public static void main(String[] args) {
        Deck player1deck = null;
        Deck player2deck = null;
        Card playerOneTopCard = null;
        Card playerTwoTopCard = null;
        int totalscore1 = 0;
        int totalscore2 = 0;
        
        
        Players winner = null;
        
        Scanner input = new Scanner(System.in); 
      
        System.out.print("Enter name of first player : ");
        String p1 = input.next();
        Players player1 = new Players(p1);
        player1.setName(p1);
        
        System.out.print("Enter name of second player : ");
        String p2 = input.next();
        Players player2 = new Players(p2);
        player2.setName(p2);
        
        if(p1.length()== 0 && p2.length() == 0 ){
            System.out.println("Please enter names");
            System.exit(100);
        }
        
             ArrayList<Card> myDeck = Deck.createDeck();
            Deck.shuffle(myDeck);
            
            // deck 1
            ArrayList<Card> first = new ArrayList<>();
            ArrayList<Card> second = new ArrayList<>();
            
            for (int i = 0; i < myDeck.size(); i++) {
                if (i < 26) {
                    first.add(myDeck.get(i));
                } else {
                    second.add(myDeck.get(i));
                }
                
                
            player1deck = new Deck(player1);
            player1deck.setDeck(first);
            player2deck = new Deck(player2);
            player2deck.setDeck(second);
            }
            
            
            System.out.println();
            boolean over = true;
            while(over){
                
            playerOneTopCard = player1deck.dealTopCard();
            playerTwoTopCard = player2deck.dealTopCard();
            
            
            
            System.out.println("Top card of "+ player1.getName() + " : " + playerOneTopCard);
            System.out.println("Top card of "+ player2.getName() + " : " + playerTwoTopCard);
            if (playerOneTopCard != null && playerTwoTopCard != null) {
              
                int comparable = playerOneTopCard.compareTo(playerTwoTopCard);

                switch (comparable) {
                    case -1: // player1 winner
                        winner = player1;
                        player1deck.addCard(playerTwoTopCard);
                        player2deck.removeCard(playerTwoTopCard);
                        System.out.println(player1.getName() + " is the winner");
                        totalscore1++;
                        player1.setScore(totalscore1);
                        System.out.println(player1.getName() + "'s score : "+ player1.getScore());
                        break;
                    case 1: // player 2 winner
                        winner = player2;
                        player2deck.addCard(playerOneTopCard);
                        player1deck.removeCard(playerOneTopCard);
                        totalscore2++;
                        System.out.println(player2.getName() + " is the winner");
                        player2.setScore(totalscore2);
                        System.out.println(player2.getName() + " score : "+ player2.getScore());
                        break;
                    default: // draw
                        winner = null;
                        System.out.println("It's Draw...");
                        System.out.println("It's Draw....\nDrawing top 3 cards");
                        break;
                }
            }
            if(player1.getCardLeft() <= 0 ||player2.getCardLeft() <= 0){
                winner = player1.getScore() > player2.getScore() ? player1 : player2;
                System.out.println("******* CONGRATULATIONS ******* \n\n" + "  Winner: " + winner.getName() +"\n\n  Score: " + winner.getScore());
            }
            
                System.out.println("Enter Y/N (Y to play again and N to exit) : " );
                String play = input.next();
            char yorn = play.charAt(0);
            if(yorn=='y'|| yorn == 'Y'){
                over = true;
            }else if(yorn=='n'||yorn=='N'){
                over = false;
                System.out.print("The winner of the game is : " + winner.getName() + " with score of : " + winner.getScore() + " points");
            }else{
                System.out.println("Please only enter Y OR N");
            }
            }
            
            
               
        
        
        

            
    }
}
