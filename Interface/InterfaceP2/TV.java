package Interface.InterfaceP2;

public abstract class TV
   {
    private boolean tvOn; 
    
    public TV() 
       {
        this.tvOn = false;    
       } // falsing
       
    public boolean getTV()
       {
        return tvOn;    
       } // Getting it
       
    public void setTVOn(boolean tvOn)
       {
        this.tvOn = tvOn;   
       } // end setting
       
    public abstract String tvType();
   } // end class 
