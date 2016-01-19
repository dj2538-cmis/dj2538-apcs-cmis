package ClassCompositionP2;

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
          
        public int totalSeconds()
        {
         int total = 0;
         int hour1 = hour * 3600;
         int min1 = min * 60;
         int sec1 = sec;
         total = hour1 + min1 + sec1;
         return total; 
        }
          
        public String toString()
          {
           String output = new String();
           output = "The time is " +  hour + " : " + min + " : " +  sec; 
           return output; 
          }
    }
    


