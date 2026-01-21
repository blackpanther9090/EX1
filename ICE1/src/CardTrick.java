/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author hassenibrahim
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        // Ask user for card value and suit, create their card
        Scanner input = new Scanner(System.in);

        System.out.print("Enter card value (1-13): ");
        int value = input.nextInt();

        System.out.print("Enter card suit (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int suitIndex = input.nextInt();
        String suit = Card.SUITS[suitIndex];

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // Search magicHand for user's card
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue() && 
                magicHand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}