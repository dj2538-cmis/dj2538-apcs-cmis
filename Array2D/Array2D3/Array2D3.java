package Array2D.Array2D3;
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
            
            for(int col = 0; col < grid[0].length; col++)
             {
                 grid[0][col] = col;
                grid[row][col] = (row * col);  
                
             }
             grid[row][0] = row;
            System.out.println("\n"); 
        }
        
         for(int row = 0; row < grid.length; row++)
        {
            
            for(int col = 0; col < grid[0].length; col++)
             {
                System.out.print(grid[row][col] + "\t"); 
             }
             
            System.out.println("\n"); 
        }
    }
}

