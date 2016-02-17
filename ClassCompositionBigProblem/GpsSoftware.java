package ClassCompositionBigProblem;
import java.util.ArrayList;

public class GpsSoftware
   {
    private ArrayList<Integer> markers = new ArrayList<Integer>(13);  
    
    public GpsSoftware()
       {
        for( int i = 0; i < markers.size(); i++ )
           {
            markers.add(i);    
           }
        
       } // end zero-arg constructor 
       
    public String toString()
       {
        String output = new String();
        
        for( Integer m : markers )
           {
            output += m;   
           }
           
        return output; 
       } // end toString
       
   } // end class