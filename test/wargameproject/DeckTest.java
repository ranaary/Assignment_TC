/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package wargameproject;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author ranaa
 */
public class DeckTest {
    

    /**
     * Test of setTopCard method, of class Deck.
     */
    @Test
    public void testSetTopCard() {
        System.out.println("setTopCard");
        int topCard = 0;
        Deck instance = null;
        instance.setTopCard(topCard);
      
    }

    @Test
    public void testSetTopCardGood() {
        System.out.println("setTopCardGood");
        int topCard = 0;
        Deck instance = null;
        instance.setTopCard(topCard);
      
    }
    
    @Test
    public void testSetTopCardBad() {
        System.out.println("setTopCardBad");
        int topCard = 0;
        Deck instance = null;
        instance.setTopCard(topCard);
      
    }
    
    @Test
    public void testSetTopCardBoundry() {
        System.out.println("setTopCardBoundry");
        int topCard = 0;
        Deck instance = null;
        instance.setTopCard(topCard);
      
    }
    /**
     * Test of getTopCard method, of class Deck.
     */
    @Test
    public void testGetTopCard() {
        System.out.println("getTopCard");
        Deck instance = null;
        int expResult = 0;
        int result = instance.getTopCard();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of dealTopCard method, of class Deck.
     */
    @Test
    public void testDealTopCard() {
        System.out.println("dealTopCard");
        Deck instance = null;
        Card expResult = null;
        Card result = instance.dealTopCard();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDealTopCardGood() {
        System.out.println("dealTopCardGood");
        Deck instance = null;
        Card expResult = null;
        Card result = instance.dealTopCard();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDealTopCardBad() {
        System.out.println("dealTopCardBad");
        Deck instance = null;
        Card expResult = null;
        Card result = instance.dealTopCard();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDealTopCardBoundry() {
        System.out.println("dealTopCard");
        Deck instance = null;
        Card expResult = null;
        Card result = instance.dealTopCard();
        assertEquals(expResult, result);
        
    }



    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        ArrayList<Card> deck = null;
        Deck.shuffle(deck);
        
    }
    
    @Test
    public void testShuffleBoundry() {
        System.out.println("shuffleBoundry");
        ArrayList<Card> deck = null;
        Deck.shuffle(deck);
        
    }

    /**
     * Test of createDeck method, of class Deck.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = Deck.createDeck();
        assertEquals(expResult, result);
       
    }
    
}
