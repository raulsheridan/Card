/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author 16474
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
        
        try ( // Ask the user to pick a card
            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Pick a card(1-13): ");
            int userCard = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter a card suit: ");
            String suit=scanner.nextLine();
            
            Card usrC1 = new Card();
            usrC1.setSuit(suit);
            usrC1.setValue(userCard);
            
            // Search for the user's card in the hand
            boolean found = false;
            for (Card c1 : hand) {
                if (c1.getValue() == usrC1.getValue() && c1.getSuit().equalsIgnoreCase(usrC1.getSuit())) {
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
    }
    
    public static Card generateHand(){
        Random rand =new Random();
        Card c1 =new Card();
        c1.setValue(rand.nextInt(13)+1);
        c1.setSuit(c1.SUITS[rand.nextInt(4)]);
        return c1;
    }
    
}
