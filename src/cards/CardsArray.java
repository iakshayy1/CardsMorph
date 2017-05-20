/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Akshay Reddy Vontari
 */
public class CardsArray {
    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    private final int DECK_SIZE = 5;
    private int clubscount;
    private int diamondscount;
    private int heartscount;
    private int spadescount;

     /**
     *no args constructor of CardsArray
     */
    public CardsArray() {
        this.clubs = new Card[DECK_SIZE];
        this.diamonds = new Card[DECK_SIZE];
        this.hearts = new Card[DECK_SIZE];
        this.spades = new Card[DECK_SIZE];
        this.clubscount = 0;
        this.diamondscount = 0;
        this.heartscount = 0;
        this.spadescount = 0;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of the club cards
     */
    public int getClubscount() {
        return clubscount;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of the diamond cards
     */
    public int getDiamondscount() {
        return diamondscount;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of the heart cards
     */
    public int getHeartscount() {
        return heartscount;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the count of the spade cards
     */
    public int getSpadescount() {
        return spadescount;
    }

    /**
     *
     * @param c object of card class
     */
    public void addCardsToArray(Card c)
{
    switch(c.getType())
    {
        case "clubs":
            if(getClubscount()<DECK_SIZE && getClubscount()>=0)
            {
                clubs[clubscount]=c;
                clubscount++;
            }
            else
            {
               removeCardsFromArray(0,c.getType());
               clubs[clubscount]=c;
                clubscount++;   
            }
            break;
        case "diamonds":
            if(getDiamondscount()<DECK_SIZE && getDiamondscount()>=0)
            {
                diamonds[diamondscount]=c;
                diamondscount++;
            }
            else
            {
               removeCardsFromArray(0,c.getType());
               diamonds[diamondscount]=c;
                diamondscount++;  
            }
            break;
        case "hearts":
            if(getHeartscount()<DECK_SIZE && getHeartscount()>=0)
            {
                hearts[heartscount]=c;
                heartscount++;
            }
            else
            {
               removeCardsFromArray(0,c.getType());
               hearts[heartscount]=c;
                heartscount++;   
            }
            break;
        case "spades":
            if(getSpadescount()<DECK_SIZE && getSpadescount()>=0)
            {
                spades[spadescount]=c;
                spadescount++;
            }
            else
            {
               removeCardsFromArray(0,c.getType());
               spades[spadescount]=c;
                spadescount++;   
            }
            break;
    }
    
        
                
                
            
                    
}

    /**
     *
     * @param position sets the index which card is to be removed
     * @param cardType sets the type of the card
     */
    public void removeCardsFromArray(int position, String cardType)
{
    switch(cardType)
    {
         case "clubs":
    if(position < getClubscount()| position > 0)
    {
        for(int i=position;i<clubs.length-1;i++)
        {
        clubs[i]=clubs[i+1];
         
    }
        this.clubscount = this.clubscount-1;
    } 
    break;

    case "diamonds":
    if(position < getDiamondscount()| position > 0)
    {
        for(int i=position;i<diamonds.length-1;i++)
        {
        diamonds[i]=diamonds[i+1];
         
    }
        this.diamondscount = this.diamondscount-1;
    } 
    break;
    case "hearts":
    if(position < getHeartscount()| position > 0)
    {
        for(int i=position;i<hearts.length-1;i++)
        {
        hearts[i]=hearts[i+1];
         
    }
        heartscount--;
    } 
    break;
    case "spades":
     if(position < getSpadescount()| position > 0)
    {
        for(int i=position;i<spades.length-1;i++)
        {
        spades[i]=spades[i+1];
         
    }
        this.spadescount = this.spadescount-1;
    } 
     break;
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
        
        return "\nHearts Array:[ "+Hearts+"]\nDiamonds Array:[ "+Diamonds+"]\nSpades Array:[ "+Spades+"]\nClubs Array:[ "+Clubs+"]";
    }


}
    
    
    
    

