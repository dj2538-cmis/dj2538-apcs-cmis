package Array2D.Array2D4;
import javax.swing.JOptionPane;

public class Array2D4
   {
    public static void main( String[] args )
       {
        int row1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Rows" ) ); 
        int col1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Columns" ) ); 
        String[][] grid = new String[row1][col1]; 
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
                                        "O", "P", "Q","R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int i = 0;
                                        
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                grid[row][col] = letters[i];
                i++;
                if( i == 26 )
                   {
                    i -= 26;   
                   } // end if 
                
               } // end inner for
           } // end outer for
           
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                    System.out.print( grid[row][col] +  "   " );                  
               } // end inner for
            System.out.println( "\n" ); 
           } // end outer for 
            
       } // end void main
       
   } // end class
