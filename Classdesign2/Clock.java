package Classdesign2;

public class Clock
    {
        private int hour = 0;
        private double cost = 0;
        private String brand = new String("");
        private boolean isOn = false;
        
        public Clock()
          {
          int hour = 0; 
          double cost = 0.0; 
          String brand = new String(); 
          boolean isOn = false; 

          } // end constructor Classsong
          
        public Clock( int hour, double cost, String brand, boolean isOn)
          {
           this.hour = hour;
           this.cost = cost;
           this.brand = new String( brand );
           this.isOn = isOn; 
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "The time is + hour + cost + brand + isOn"; 
           return output; 
          }
    }
    