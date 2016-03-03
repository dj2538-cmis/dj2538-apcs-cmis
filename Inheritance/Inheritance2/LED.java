package Inheritance.Inheritance2;

public class LED extends Television
  {
   LED(String model, double price)
      {
       super(model, price); 
      } // end zero-args constructor
      
   public String toString()
      {
       return super .toString();    
      } // end toString
  } // end class