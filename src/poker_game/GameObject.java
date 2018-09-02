package poker_game;

public abstract class GameObject
{
    private String graphic;
    
    
    public String getGraphic()
    {
        return graphic;
    }
    
    //Load whatever the string will be, obtain from text file
    public abstract void loadGraphic();
    
        
    
    
}
