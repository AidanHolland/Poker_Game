
package poker_game;


public abstract class Controllable extends GameObject
{
    private int bankRoll;
    private int orderNumber;
    private int amountToRaise;
    
    
    
    
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
        //Raise pot
        
    }
    
    public void check()
    {
    }
    
    public void fold()
    {
    }
   
}
