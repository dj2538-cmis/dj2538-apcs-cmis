package GpsTrail;
import java.util.ArrayList;

public class GpsSoftware
   { 
    ArrayList<Integer> markers = new ArrayList<Integer>();
    
    public GpsSoftware()
       {
         markers.add(100);
         markers.add(150);
         markers.add(105);
         markers.add(120);
         markers.add(90);
         markers.add(80);
         markers.add(50);
         markers.add(75);
         markers.add(75);
         markers.add(70);
         markers.add(80);
         markers.add(90);
         markers.add(100);
       } // end void main 
       
    public GpsSoftware(ArrayList markers)
       {
        this.markers = markers; 
       } // end arraylist makers
    
    public void addMarker(Integer Marker)
       {
        markers.add(Marker);
       } // end add markers
    
    public int getLength()
       {
        int length = 0;
        
        for(int i = 0; i < markers.size(); i++)
           {
            length += markers.get(i);
           } // end for 
           
        return length;
       } // end getter
    
    public boolean isLevelTrailSegment(int begin, int end)
       {
        boolean level = false;
                    
        for( int i = begin; i < end; i++ )
           {
            if(i > begin && Math.abs(markers.get(i) - markers.get(i-1)) < 10)
               {
                level = true;
               } // end if 
           } // end for 
        
        if (markers.get(begin) == markers.get(end) && level == true)
           {
            return true;
           } // end if 
        else
           {
            return false;
           } // end else

       } // end boolean
        
    public boolean isDifficult( int begin, int end )
    {
        int height = 0;
        
        for( int i = begin; i < end; i++ )
           {
            if( i > begin && markers.get(i) - markers.get(i-1) > 0)
               {
                height += Math.abs(markers.get(i) - markers.get(i-1));
               } // end if
           } // end for 
        
        if (height > 100 && isLevelTrailSegment(begin, end))
           {
            return true;
           } // end if 
        else 
           {
            return false;
           } // end else 
        } // end boolean
    
    public String toString()
       {
        String output = new String();
        
        for( int i = 0; i < markers.size(); i++ )
           {
            output = output + i + " " + markers.get(i) + "\n";  
           } // end for 
        
        return output;  
       } // end String toString
       
    } // end class 