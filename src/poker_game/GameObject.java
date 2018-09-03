package poker_game;

public abstract class GameObject
{
    protected String graphic;
    protected String loadPath;
    
    
    GameObject(String loadPath)
    {
        this.loadPath = loadPath;
        this.graphic = loadGraphic(this.loadPath);
    }
    
    public String getGraphic()
    {
        return graphic;
    }
    
    //Load whatever the string will be, obtain from text file
    public String loadGraphic(String loadPath)
    {
        return "";
    }
    
        
    
    
}
