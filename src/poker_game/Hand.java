package poker_game;
import java.util.Arrays;

public class Hand extends GameObject
{
    Card cardsInHand[] = new Card[2];
    
    
    public Hand(String loadPath)
    {
        
        super("");
    }
    
    
    //Return a String with cards value "IE Flush of Hearts, Jack High"
    public String identifyHand()
    {
        for(int i = 0; i < GameController)
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
