package ClassMethod2;


public class Clock
    {
        private int hour;
        private int min;
        private int sec;
        private int add; 
        private int minus;
        private int total;
        
        public Clock()
          {
          hour = 15; 
          min = 45;
          sec = 23;
          } // end constructor Classsong
          
        
        public void setTimer( int hour, int min, int sec )
        {
         this.hour = hour;
         this.min = min;
         this.sec = sec; 
        }
        
        public void converDaylightSavingplus( int hour )
        {
          this.hour = hour + 1;
        }
        
        public void converDaylightSavingminus( int hour )
        {
          this.hour = hour - 1;
        }
        
        public void totalSeconds(int hour, int min, int sec)
        {
         this.hour = hour * 3600;
         this.min = min * 60;
         this.sec = sec;
         return totalSeconds;
        }
        
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
    