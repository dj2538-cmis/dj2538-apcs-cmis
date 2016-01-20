package ClassCompositionP3;

public class Roster 
   {
    private Students[] Roster;
   
    public Roster()
       {
        this.Roster = new Students[3];
        Roster[0] = new Students( "DJ", "Ketsing", 17, 59.3, 2016, "" , 1, 2, 3, 4, 1 );
        Roster[1] = new Students( "Drake", "Jones", 30, 90.6, 2020, "", 4, 4, 3, 4, 2 );
        Roster[2] = new Students( "Blingbling", "Singh", 12, 40.5, 2010, "", 4, 4, 4, 3.5, 4 );
       } // end zer-arg constructor
    
    public double findStudentWithMaxGPA() 
       {
        int maxGPAI = 0;
        int maxGPA = 0;
        
        for( int i = 0; i < Students.length; i++)
           {
            if( Students[i].totalSeconds() > maxSeconds )
               {                   
                maxClock = i;
                maxSeconds = clocksInStock[i].totalSeconds();
               }
           }
           
        return clocksInStock[maxClock];    
           
       }
       
    public String toString()
       {
        String output = new String();
        
        for( Students s : Roster )
           {
            output += s + "\n" + "\n";  
           }
        
        return output;  
       } // end method toString 
       
   } // end class


