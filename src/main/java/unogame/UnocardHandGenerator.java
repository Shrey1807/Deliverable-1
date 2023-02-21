package unogame;

import java.util.Random;

/** This class +++ Insert class description here +++
 *
 * @author Shrey Jani 
 */
public class UnocardHandGenerator {
    
     public static card[] generateHand(int handSize){
    
        card[] hand=new card[handSize];
        //generate random numbers and suit for 7 cards
        //1)generate hand of 7 cards randomly
        Random random=new Random();
        
        for(int i=0; i<hand.length;i++)
        {
//            int value=random.nextInt(13)+1;
//            String suit=Card.SUITS[random.nextInt(4)];
      
            card.Value value=card.Value.values()[random.nextInt(15)];
            card.Color color=card.Color.values()[random.nextInt(4)];
            card card=new card(value,color);
            hand[i]=card;        
        
        }
        return hand;
    }
}
