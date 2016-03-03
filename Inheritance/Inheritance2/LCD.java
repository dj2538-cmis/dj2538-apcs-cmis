package Inheritance.Inheritance2;

public class LCD extends Television
  {
   LCD(String model, double price)
      {
       super(model, price); 
      } // end zero-args constructor
      
   public String toString()
      {
       return super .toString();    
      } // end toString
  } // end class