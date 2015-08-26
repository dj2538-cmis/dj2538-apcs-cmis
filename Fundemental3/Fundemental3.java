package Fundemental3;

import javax.swing.JOptionPane; 

public class Fundemental3

 {
     public static void main( String[] args)
     {
     String input1 = JOptionPane.showInputDialog( "Pick a number");
     
     int num1 = Integer.parseInt( input1 );
     
     if(num1 % 2 == 1)
          {
          System.out.println( num1 + " is a odd number" );
          }
          
     if(num1 % 2 == 0)
          {
          System.out.println( num1 + " is a even number" );
          }
         
         
     } // end main
     
     
 } // end class fundemental3