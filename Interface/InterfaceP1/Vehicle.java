package Interface.InterfaceP1;

public abstract class Vehicle implements Connectable, Discountable
   {
    private int numpassengers; 
    
    public Vehicle()
       {
        this.numpassengers = 0;   
       } // end zero-constructor
       
    public Vehicle( int passengers ) 
       {
        this.numpassengers = passengers; 
       } // end one-constructor
       
    public abstract void connectobluetooth(); 
    public abstract String discountable();
       
    public String toString()
       {
        return "Number of passengers: " + numpassengers;   
       } // end toString 
       
    } // end class
