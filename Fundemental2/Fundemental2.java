package Fundemental2;

import javax.swing.JOptionPane; 

public class Fundemental2
    {
    public static void main( String args[] )
        {
       String input1 = JOptionPane.showInputDialog( "Pick a number"); 
       String input2 = JOptionPane.showInputDialog( "Pick another number"); 
       
       float num1 = Integer.parseInt( input1 );
       float num2 = Integer.parseInt( input2 ); 
        
       if( num1 > num2 )
          {
          System.out.println( "Your first pick which is " +num1  + " is greater than your second number which is "  +num2 );
          }
       if ( num2 > num1 )
          { 
          System.out.println( "Your second pick which is " +num2  + " is greater than your first pick "  +num1 );
          }
       
       if( num1 == num2 )
          {
          System.out.println( "Your first pick which is " +num1  + " is the same as your second pick "  +num2 );
          }
       
        } // end method
        
    } // end class