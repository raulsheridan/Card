/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;


import java.util.Random;


/**
 *
 * @author 16474
 *@modifier Raul Desai 991711911
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create an array to store the hand of cards
        Card[] hand = new Card[7];
        
        for (int i = 0; i < hand.length; i++) {
            hand[i] = generateHand();
        }
        
         Card luckyCard = new Card();
           luckyCard.setSuit("Hearts");
           luckyCard.setValue(9); 
           hand[0] = luckyCard;
        
        
           
            
            // Search for the user's card in the hand
           boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
                }
            }
            
            // Report the result
            if (found) {
                System.out.println("Congratulations! Your card is in the magic hand of random cards.");
            } else {
                System.out.println("Sorry, your card is not in the magic hand of random cards.");
            }
        }
     public static Card generateHand() {
        Random rand = new Random();
        Card card = new Card();
        card.setValue(rand.nextInt(13) + 1);
        card.setSuit(card.SUITS[rand.nextInt(4)]);
        return card;
     
    }
    
 }
    

