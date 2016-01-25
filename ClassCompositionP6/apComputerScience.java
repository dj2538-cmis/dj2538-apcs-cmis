package ClassCompositionP6;
import java.util.ArrayList;

public class apComputerScience
   {
    private ArrayList<Students> myStudents;
   
    public apComputerScience()
       {
       this.myStudents = new ArrayList<Students>();
       this.myStudents.add( new Students ( "DJ", "Ketsing", 2.39 ) );
       this.myStudents.add( new Students ( "Drake", "Jones", 3.18 ) );
       this.myStudents.add( new Students ( "Blingbling", "Singh", 3.56 ) );
       } // end zer-arg constructor
    
    public void addStudent ( Students newStudent )
      {
       this.myStudents = new ArrayList<Students>();
       this.myStudents.add( new Students ( "DJ", "Ketsing", 2.39 ) );
       this.myStudents.add( new Students ( "Drake", "Jones", 3.18 ) );
       this.myStudents.add( new Students ( "Blingbling", "Singh", 3.56 ) );
           
      }    
      
    public void dropStudent ( String lastName )
       {
        for( int i = 0; i < myStudents.size(); i++ )
           {
            if( myStudents.get( i ).equals( "Ketsing" ) )
               {
                myStudents.remove( i );     
               }
           }
           
       }
      
    public String findStudentWithMaxGPA() 
       {
        int max = 0;
        
        for( int i = 0; i < myStudents.size(); i++ )
           {
            if( myStudents.get( i ).getGPA() > myStudents.get( max ).getGPA() )
            {
             max = i;   
            }
           }
           
        return myStudents.get( max ).getName();
           
       }
       
    public String toString()
       {
        String output = new String();
        
        output = "Student with most GPA: " + findStudentWithMaxGPA() + "\n\n";
        
        for( Students s : myStudents )
           {
            output += s + "\n" + "\n";  
           }
    
        return output;  
       } // end method toString 
       
   } // end class



