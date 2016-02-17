package Array2D.Array2D2;
import javax.swing.JOptionPane;

public class Array2D2
   {
    public static void main( String[] args )
       {
        int[][] grid = new int[3][5];
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int i = 0;
        int sum = 0;
        int sumRow1 = 0;
        int sumRow2 = 0;
        int sumRow3 = 0;
        int sumCol1 = 0;
        int sumCol2 = 0;
        int sumCol3 = 0;
        int sumCol4 = 0;
        int sumCol5 = 0;


        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {

                grid[row][col] = numbers[i];
                i++; 
               } // end inner for 
               
           } // end outer for 
           
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {

                System.out.print( grid[row][col] + "\t" );   

                System.out.print( grid[row][col] + " " );   

               } // end inner for 
            System.out.println( "\n" );
           } // end outer for 
           
       for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                sum += grid[row][col];  
               } // end inner for 
               
           } // end outer for
           
        for( int row = 0; row < grid.length; row++ )
           {
            sumCol1 += grid[row][0];
            sumCol2 += grid[row][1];
            sumCol3 += grid[row][2];
            sumCol4 += grid[row][3];
            sumCol5 += grid[row][4];
           } // end outer for 
           
        for( int col = 0; col < grid[0].length; col++ )
           {
            sumRow1 += grid[0][col];
            sumRow2 += grid[1][col];
            sumRow3 += grid[2][col];
           } // end inner for  
           
        System.out.println( "The sum of the 2D array is " + sum );
        System.out.println( "The sum of Column 1 is: " + sumCol1 );
        System.out.println( "The sum of Column 2 is: " + sumCol2 );
        System.out.println( "The sum of Column 3 is: " + sumCol3 );
        System.out.println( "The sum of Column 4 is: " + sumCol4 );
        System.out.println( "The sum of Column 5 is: " + sumCol5 );
        System.out.println( "The sum of Row 1 is: " + sumRow1 );
        System.out.println( "The sum of Row 2 is: " + sumRow2 );
        System.out.println( "The sum of Row 3 is: " + sumRow3 );
           
       } // end void main
       
   } // end class 





