package Fundemental9;

import javax.swing.JOptionPane;  

public class Fundementa9
    {
     public static void main ( String args[]) 
        {
         String input1 = JOptionPane.showInputDialog( "Username"); 
         String input2 = JOptionPane.showInputDialog( "Password (Number)");  
         int num1 = Integer.parseInt( input2 );
         
         if(input1.equals("DJ Ketsing") && num1 == 1234)
         {
          System.out.println("Login successful"); 
         }
         else
         {
          System.out.println("Unsuccessful login");
         }
     
        } // end method 
        
    } // end class 
     
