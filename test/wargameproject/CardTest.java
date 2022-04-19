/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wargameproject;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ranaa
 */
public class CardTest {
    
    public CardTest() {
    }
 
    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card();
        Suit expResult = null;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        Suit suit = null;
        Card instance = new Card();
        instance.setSuit(suit);
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = new Card();
        Rank expResult = null;
        Rank result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRank method, of class Card.
     */
    @Test
    public void testSetRank() {
        System.out.println("setRank");
        Rank rank = null;
        Card instance = new Card();
        instance.setRank(rank);
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Card instance = new Card();
        instance.setValue(value);
    }

    /**
     * Test of getWinnerCard method, of class Card.
     */
    @Test
    public void testGetWinnerCard() {
        System.out.println("getWinnerCard");
        Card card1 = null;
        Card card2 = null;
        int comparable = 0;
        Card expResult = null;
        Card result = Card.getWinnerCard(card1, card2, comparable);
        assertEquals(expResult, result);
    }


    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card card = null;
        Card instance = new Card();
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToGood() {
        System.out.println("compareToGood");
        Card card = null;
        Card instance = new Card();
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToBad() {
        System.out.println("compareToBad");
        Card card = null;
        Card instance = new Card();
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToBoundry() {
        System.out.println("compareToBoundry");
        Card card = null;
        Card instance = new Card();
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
    }
    
}
