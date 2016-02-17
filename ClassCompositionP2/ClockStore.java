package ClassCompositionP2;

public class ClockStore
   {
    private Clock[] clocksInStock;
    
    public ClockStore()
       {
        this.clocksInStock = new Clock[3];    
<<<<<<< HEAD
        clocksInStock[0] = new Clock( 12, 30, 45 );
=======
        clocksInStock[0] = new Clock( 3, 0, 0 );
>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
        clocksInStock[1] = new Clock( 6, 30, 20 );
        clocksInStock[2] = new Clock( 10, 30, 10 );
       } // end zero-arg constructor
       
    public Clock mostseconds()
       {
        int maxSeconds = 0;
        int maxClock = 0;
        
        for( int i = 0; i < clocksInStock.length; i++)
           {
            if( clocksInStock[i].totalSeconds() > maxSeconds )
               {                   
                maxClock = i;
                maxSeconds = clocksInStock[i].totalSeconds();
               }
           }
           
        return clocksInStock[maxClock]; 
       } // end mostseconds()
     
    public String toString()
       {
        String output = new String();
        
        output = "Most seconds: " + mostseconds() + "\n"; 
        
        for( Clock c : clocksInStock )
           {
            output += c + "\n";  
           }
                 
        return output;  
       } // end method toString 
      
<<<<<<< HEAD
   } // end clas
=======
   } // end class

>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
