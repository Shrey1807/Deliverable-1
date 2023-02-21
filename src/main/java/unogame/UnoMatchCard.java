package unogame;

/** This class +++ Insert class description here +++
 *
 * @author Shrey Jani 
 */
public class UnoMatchCard {
    
     public static void MatchCard(card userPick, card[] hand)
    {
         boolean match = false;
    for(card card: hand){
        if(card.getValue() == userPick.getValue() 
                && card.getColor().equals(userPick.getColor())){
            match = true;
            break;
        }
    }
    
    if(match)
    System.out.println("Card is matched");
    else
    System.out.println("Mo match is found");
    
    //String response = match ? "You guessed it right!": "Sorry no match...";
//    System.out.println(response);
    }
}
