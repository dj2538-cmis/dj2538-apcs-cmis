package Classdesign2;

public class Clock
    {
        private int hour;
        private int min;
        private int sec;
        
        public Clock()
          {
          hour = 15; 
          min = 45;
          sec = 23;
          } // end constructor Classsong
          
        public Clock( int hour, int min, int sec)
          {
           this.hour = hour;
           this.min = min;
           this. sec = sec;
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "The time is " +  hour + " : " + min + " : " +  sec; 
           return output; 
          }
    }
    