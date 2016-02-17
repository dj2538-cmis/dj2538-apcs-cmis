package Array2D.Array2D1;
<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14

public class Array2D1
   {
    public static void main( String[] args )
       {
<<<<<<< HEAD
        int row1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Rows" ) ); 
        int col1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Columns" ) ); 
        int[][] grid = new int[row1][col1];
=======
        int[][] grid = new int[3][4];
>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
        
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                grid[row][col] = ( int )( Math.random() * 9 ) + 0;   
               } // end inner for
               
           } // end outer for
           
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {    
                System.out.print( grid[row][col] + " " );
               } // end inner for
               
            System.out.println( "\n" ); 
            
           } // end outer for
           
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {    
                if( grid[row][col] == 5 )
                   {
                    System.out.print( "Five is in Row: " + (row + 1) + " Column: " + (col + 1) + "\n");     
                   } // end if
               } // end inner for
            
           } // end outer for
           
       } // end void man
       
<<<<<<< HEAD
   } // end class 
=======
   } // end class 

>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
