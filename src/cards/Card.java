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
public class Card {
    private int number;
    private String Type;
    
    /** constructor with two parameters
     *
     * @param number Number of cards
     * @param type type of card
     */
    public Card(int number, String type)
    {
        this.number=number;
        this.Type=type;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the number of card
     */
    public int getNumber() {
        return number;
    }

    /**when we call getters in main method it gives return type
     *
     * @return the type of card
     */
    public String getType() {
        return Type;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param number sets the value of number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**When we call setters in the main method it sets the value.
     *
     * @param Type sets the type of card
     */
    public void setType(String Type) {
        this.Type = Type;
    }
     /** Returns the string representation of a variable or operation
     * 
     * @return  Returns the string temp when we call toString method in main method
     */

    @Override
    public String toString() {
        return ""+number;
    }
    
    
    
}
