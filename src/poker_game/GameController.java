package poker_game;

public class GameController
{
    private Player[] activePlayers;
    private int buttonPosition;
    private String[][] handRankings;
    private int pot;
    private static Card[] communityCards;
    
    public void startGame(int numberOfPlayers)
    {
        activePlayers = new Player[numberOfPlayers];
        communityCards = new Card[3];
        
        for(int i = 0; i < numberOfPlayers; i++)
        {
            activePlayers[i] = new Player();
        }
        activePlayers[0].setControllable(true);
        //Issue money to each player
        //Set each player to active
        //Reset all variables
        
    }
    
    public void runGame()
    {
        //Loop this section?
        
    }
    
    public void endGame()
    {
        //Reset all variables
        //Return to menu
    }
    
    public void input()
    {
        //Store input commands here
        // "f" fold, "c" check, "r" raise by increment
    }
    
    public void dealCards()
    {
    }
    
    public void awardPot(Player winner)
    {
        winner.setBankRoll(pot + winner.getBankRoll());
        
    }
    
    public Card[] getCommunityCards()
    {
        return communityCards;
    }
}
