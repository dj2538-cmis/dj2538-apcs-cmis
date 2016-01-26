package ClassCompositionP6;

public class apComputerScienceDriver
   {
    public static void main (String[] args) 
       {
        apComputerScience period1 = new apComputerScience();
        System.out.println( "Beginning Class: \n\n" );

        System.out.println( period1 );
        System.out.println( "Class after dropped student: \n\n" );
        period1.dropStudent( "Singh" );
        System.out.println( period1 );
        
        
       }
       
   }


