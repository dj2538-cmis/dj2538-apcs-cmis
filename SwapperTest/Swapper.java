package SwapperTest;

public class Swapper
   {
    public static void main ( String[] args )
       {
        int[][] grid = new int[][] {{9, 2, 2, 5, 4, 9, 5, 5, 8, 5},
                                    {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                                    {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                                    {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                                    {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                                    {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                                    {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                                    {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                                    {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                                    {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}}; 
        int[] rowproduct = new int[]{1,1,1,1,1,1,1,1,1,1};
        int[] colproduct = new int[]{1,1,1,1,1,1,1,1,1,1};
                               
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {  
                if(grid[row][col] != 0)
                    {
                     rowproduct[row] *= grid[row][col];
                    }//end if
                
           
               } // end inner for
            System.out.println( "\n" ); 
           } // end outer for
           
       for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                if(grid[col][row] != 0)
                   {
                    colproduct[row] *= grid[col][row];
                   

                   } // end if
                
                
                
           
               } // end inner for
            System.out.println( "\n" ); 
           } // end outer for
        
        
       for (int i: rowproduct)
        {
         System.out.println(i);
        }//end for
       
        System.out.println("\n\n");
        
        for (int i: colproduct)
        {
         System.out.println(i);
        }//end for
           
           
        for( int col = 0; col < grid[0].length; col++ )
           {                 
                          
           } // end row for
        
       
       } // end void main
   } // end class