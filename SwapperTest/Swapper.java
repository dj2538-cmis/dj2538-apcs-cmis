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
        int productCol1 = 0;    int productRow1 = 0;
        int productCol2 = 0;    int productRow2 = 0;
        int productCol3 = 0;    int productRow3 = 0;
        int productCol4 = 0;    int productRow4 = 0;
        int productCol5 = 0;    int productRow5 = 0;
        int productCol6 = 0;    int productRow6 = 0;
        int productCol7 = 0;    int productRow7 = 0; 
        int productCol8 = 0;    int productRow8 = 0;
        int productCol9 = 0;    int productRow9 = 0; 
        int productCol10 = 0;   int productRow10 = 0; 
                               
        for( int row = 0; row < grid.length; row++ )
           {
            for( int col = 0; col < grid[0].length; col++ )
               {
                System.out.print( grid[row][col] + "\t" );
               } // end inner for
            System.out.println( "\n" ); 
           } // end outer for
        
        for( int row = 0; row < grid.length; row++ )
           {
            if( row != 0 )
               {
            productCol1 *= grid[row][0];
            productCol2 *= grid[row][1];
            productCol3 *= grid[row][2];
            productCol4 *= grid[row][3];
            productCol5 *= grid[row][4];
            productCol6 *= grid[row][5];
            productCol7 *= grid[row][6];
            productCol8 *= grid[row][7];
            productCol9 *= grid[row][8];
            productCol10 *= grid[row][9];
               } // end if 
             
           } // end col for
           
        for( int col = 0; col < grid[0].length; col++ )
           {
               if( col != 0 )
               {
            productRow1 *= grid[0][col];
            productRow2 *= grid[1][col];
            productRow3 *= grid[2][col];
            productRow4 *= grid[3][col];
            productRow5 *= grid[4][col];
            productRow6 *= grid[5][col];
            productRow7 *= grid[6][col];
            productRow8 *= grid[7][col];
            productRow9 *= grid[8][col];
            productRow10 *= grid[9][col];
                }
           } // end row for
        
        System.out.println( "Product of Colnum 1 : " + productCol1 ); 
        System.out.println( "Product of Colnum 2 : " + productCol2 ); 
        System.out.println( "Product of Colnum 3 : " + productCol3 ); 
        System.out.println( "Product of Colnum 4 : " + productCol4 ); 
        System.out.println( "Product of Colnum 5 : " + productCol5 ); 
        System.out.println( "Product of Colnum 6 : " + productCol6 ); 
        System.out.println( "Product of Colnum 7 : " + productCol7 ); 
        System.out.println( "Product of Colnum 8 : " + productCol8 ); 
        System.out.println( "Product of Colnum 9 : " + productCol9 ); 
        System.out.println( "Product of Colnum 10 : " + productCol10 );
        System.out.println( "\n" );
        System.out.println( "Product of Row 1 : " +  productRow1 ); 
        System.out.println( "Product of Row 2 : " + productRow2 ); 
        System.out.println( "Product of Row 3 : " + productRow3 ); 
        System.out.println( "Product of Row 4 : " + productRow4 ); 
        System.out.println( "Product of Row 5 : " + productRow5 ); 
        System.out.println( "Product of Row 6 : " + productRow6 ); 
        System.out.println( "Product of Row 7 : " + productRow7 ); 
        System.out.println( "Product of Row 8 : " + productRow8 ); 
        System.out.println( "Product of Row 9 : " + productRow9 ); 
        System.out.println( "Product of Row 10 : " + productRow10 ); 
        
       } // end void main
   } // end class