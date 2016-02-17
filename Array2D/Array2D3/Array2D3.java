package Array2D.Array2D3;
<<<<<<< HEAD
import javax.swing.JOptionPane; 

public class Array2D3
{
    public static void main ( String arg[] )
    {
        int row1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Rows" ) ); 
        int col1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter Columns" ) ); 
        int[][] grid = new int[row1][col1];
        
        for(int row = 0; row < grid.length; row++)
        {
            System.out.print(row + "\t");
            
            for(int col = 0; col < grid[0].length; col++)
             {
                grid[row][col] = (row * col);  
                System.out.print(grid[row][col] + "\t"); 
             }
             
            System.out.println("\n"); 
        }
    }
}
=======

public class Array2D3
   {
     public static void main( String[] args )
        {
         int[][] grid = new int[10][10];
         
         for( int row = 0; row < grid.length; row++ )
            {
             for( int col = 0 ; col < grid[0].length; col++ )
                {
                 grid[row][col] = row*col;    
                 grid[0][col] = col;
                } // end inner 
             grid[row][0] = row;
            } // end outer for
            
         for( int row = 1; row < grid.length; row++ )
            {
             for( int col = 1; col < grid[0].length; col++ )
                {
                 System.out.print( grid[row][col] + "\t"  ); 
                } // end inner for
             System.out.println( "\n" );
            } // end outer for
        } // end void main
       
   } // end class 
>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
