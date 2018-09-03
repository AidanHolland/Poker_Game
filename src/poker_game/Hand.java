package poker_game;
import java.util.Arrays;

public class Hand extends GameObject
{
    Card cardsInHand[] = new Card[2];
    
    
    
    
    //Return a String with cards value "IE Flush of Hearts, Jack High"
    public String identifyHand()
    {
        return "";
    }
    
    public void fillHand(Card card1, Card card2)
    {
        cardsInHand[0] = card1;
        cardsInHand[1] = card2;
    }
    
    public void clearHand()
    {
        //Remove all cards in array
        Arrays.fill(cardsInHand, null);
    }
    
   
}
