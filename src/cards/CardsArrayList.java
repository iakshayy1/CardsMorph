/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class CardsArrayList {
    private ArrayList<Card> clubs = new ArrayList<Card>() ;
    private ArrayList<Card> diamonds = new ArrayList<Card>();
    private ArrayList<Card> hearts = new ArrayList<Card>();
    private ArrayList<Card> spades = new ArrayList<Card>();

    /**
     * no-args constructor of CardArrayList
     */
    public CardsArrayList() 
    {
        this.clubs=clubs;
        this.diamonds=diamonds;
        this.hearts=hearts;
        this.spades=spades;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of club cards
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of diamond cards
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of heart cards
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of spade cards
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }
    
    /**
     *
     * @param c object in card class
     * @return adds cards to the array list
     */
    public String addCardsToList(Card c)
    {
        
        
        switch(c.getType())
        {
            case "clubs":
                clubs.add(c);
                return "card added successfully";
               
            case "diamonds":
                diamonds.add(c);
                return "card added successfully";
               
            case "hearts":
                hearts.add(c);
                return "card added successfully";
               
            case "spades":
                spades.add(c);
                return "card added successfully";
               
            default:   
                return "Not added sucessfully";
                
        }
         
         
        
    }
    
    /**
     *
     * @param position sets the index which card is to be removed
     * @param c object in class c
     * @return the cards which are to be removed from the list
     */
    public String removeCardsFromList(int position, ArrayList<Card> c)
    {
       
        if(position<0 | position>=c.size())
        {
            return "ArrayList size underflow, card cannot be removed";
        }
        else
        {
         c.remove(position);
         return "Card is removed successfully!";
        }
         
       
    }
    /** Returns the string representation of a variable or operation
     * 
     * @return  Returns the string temp when we call toString method in main method
     */

    @Override
    public String toString() {
        String Hearts="";
        for(Card H: hearts)
        { 
            if(H!=null)
            {
            Hearts=Hearts +H+ "  ";
            }
        }
        
        String Diamonds="";
        for(Card D: diamonds)
        {
            if(D!=null)
            {
            Diamonds=Diamonds +D+ "  ";
            }
        }
        
        String Spades="";
        for(Card S: spades)
        {
            if(S!=null)
            {
            Spades=Spades +S+ "  ";
            }
        }
        
        String Clubs="";
        for(Card C: clubs)
        {
            if(C!=null)
            {
            Clubs=Clubs +C+ "  ";
            }
        }
        
        return "Hearts ArrayList:[ "+Hearts+"]\nDiamonds ArrayList:[ "+Diamonds+"]\nSpades ArrayList:[ "+Spades+"]\nClubs ArrayList:[ "+Clubs+"]";
    }
       
    
    
        

    
    
}
