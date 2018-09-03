
package poker_game;


public class Player extends GameObject
{
    private int bankRoll;
    private int orderNumber;
    private int amountToRaise;
    
    public Player()
    {
        super("");
    }
    
    
    public void setBankRoll(int bankRoll)
    {
        this.bankRoll = bankRoll;
    }
    
    public int getBankRoll()
    {
        return bankRoll;
    }
    
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    
    
    public void raise(int raiseAmount)
    {
        if(bankRoll < raiseAmount)
        {
            
        }
        //Raise pot
        //Reduce self amount
        
    }
    
    public void check()
    {
    }
    
    public void fold()
    {
    }
   
}
