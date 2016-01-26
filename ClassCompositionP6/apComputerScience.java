package ClassCompositionP6;
import java.util.ArrayList;

public class apComputerScience
   {
    private ArrayList<Students> myStudents = new ArrayList<Students>();
   
    public apComputerScience()
       {
       Students a = new Students( "DJ ", "Ketsing", 2.39 );
       Students b = new Students( "Drake ", "Jones", 3.18 );
       Students c = new Students( "Blingbling ", "Singh", 3.56 );
       
       myStudents.add( a );
       myStudents.add( b );
       myStudents.add( c );
       
       } // end zer-arg constructor
    
    public void addStudent(Students New)
       {        
        myStudents.add(New);
       }
    
    public void dropStudent(String lastName)
       {
        for (int i = 0 ; i < myStudents.size() ; i++)
           {
            if (myStudents.get(i).lastname.equals( lastName ) )
               {
                myStudents.remove(i);
                i--;
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



