package Array2D.Array2D3;

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