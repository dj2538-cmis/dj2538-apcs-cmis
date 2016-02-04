package ClassCompositionP4;
import java.util.ArrayList; 

public class Family
   {
    public static void main( String[] args )
       {
        ArrayList<String> Family = new ArrayList<String>(); 
        
        Family.add( "Dad: Jan" );
        Family.add( "Mom: Par" );
        Family.add( "Me: DJ" );
        Family.add( "Dog: Cindy" );
        System.out.println( "Family members: " + Family.size() );
        
        for( int index = 0; index < Family.size(); index++ )
           {
            System.out.println( Family.get(index) );    
           }
           
       } // end main method 
       
   } // end class