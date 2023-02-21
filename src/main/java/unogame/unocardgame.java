package unogame;

import java.util.Random;
import java.util.Scanner;


/** This class +++ Insert class description here +++
 *
 * @author Shrey Jani 
 */
public class unocardgame {

    




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        //an array of card to hold 7 cards
        //Card[] hand=new Card[7];
        card[] hand = UnocardHandGenerator.generateHand(15);
        
        System.out.println("Enter number of cards in a hand: ");
        int num=input.nextInt();
        //card[] hand=UnocardHandGenerator.generateHand(num);
               
        //print the hand
        System.out.println("Cards in hand: ");
        for(card card:hand)
        {
            System.out.printf(card.getValue()+" of "+ card.getColor());
            System.out.println("");
        }
        
        //2)ask user to pick a card for match
        
        System.out.println("Pick a card for match:");
        System.out.println("Pick a suit for your card: ");
//        String s=input.nextLine();
        for(int i=0; i<card.Color.values().length;i++)
        {
            System.out.println((i+1)+": "+card.Color.values()[i]);
        }
        
        int suitPos=input.nextInt()-1;
        
        System.out.println("Enter value from 1 to 13: ");
       
       // Card userPick=new Card(value,s);
       for(int i=0; i<card.Value.values().length;i++)
        {
            System.out.println((i+1)+": "+card.Value.values()[i]);
        }
        
        int valuePos=input.nextInt()-1;
        
        card userPick=new card(card.Value.values()[valuePos],card.Color.values()[suitPos]);
        
        //check for a user card match in hand of 7 cards
        UnoMatchCard.MatchCard(userPick, hand);
        
    }
}

    

