package ClassCompositionP3;

public class Roster 
   {
    private Students[] Roster;
   
    public Roster()
       {
        this.Roster = new Students[3];
        Roster[0] = new Students( "DJ", "Ketsing", 2.5 );
        Roster[1] = new Students( "Drake", "Jones", 3.7 );
        Roster[2] = new Students( "Blingbling", "Singh", 3.72 );
       } // end zer-arg constructor
    
    public String findStudentWithMaxGPA() 
       {
        int max = 0;
        
        for( int i = 0; i < Roster.length; i++ )
           {
            if( Roster[i].getGPA() > Roster[ max ].getGPA() )
            {
             max = i;   
            }
           }
           
        return Roster[ max ].getName();
           
       }
       
    public String toString()
       {
        String output = new String();
        
        output = "Student with the highest GPA: " + findStudentWithMaxGPA() + "\n\n";
        
        for( Students s : Roster )
           {
            output += s + "\n" + "\n";  
           }
        
        return output;  
       } // end method toString 
       
   } // end class


<<<<<<< HEAD
=======

>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
