package Array2D.Array2D2;
import javax.swing.JOptionPane;

public class Array2D2
   {
    public static void main( String[] args )
       {
        int[][] grid = new int[3][5];
        int[] colsums = new int[5];
        int[] rowsums = new int[3];
        int i = 0;
        int total = 0; 


        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                grid[row][col] = i + col + 1 ;
                colsums[col] += grid[row][col];
                rowsums[row] += grid[row][col];
               } // end inner for 
            i = i + grid[0].length;
           } // end outer for 
           
        for (int[] n : grid )
        {
            for(int num : n)
             {
                 total += num;
                 System.out.print( num  + "\t");
              } // end inner for 
            System.out.println( "\n"  );
        } // end outer fod 
        
        System.out.println("Total : " + total); 
        
        for (int x = 0; x < grid.length; x++)
        {
            System.out.println("Sum of row " + (x+1) + " is : " + rowsums[x]);
        } // end for 
        
        for(int x = 0; x < grid[0].length; x++)
             {
            System.out.println("Sum of column " + (x+1)  + " is : " + colsums[x]);
         } // end for 
           
       } // end void main
       
   } // end class 





