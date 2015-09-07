package TestOneHelp;

import javax.swing.JOptionPane; 

public class TestHELP 
    { 
     public static void main ( String args[] )
     {
      String a = JOptionPane.showInputDialog ("Number please");
      int b = Integer.parseInt(a); 
      double[] arrayA = new double [b]; 
      
      for (int index = 0; index < arrayA.length;index++)
         {
          double randsDouble = Math.random() * (50 - 1) + 1 ;
          arrayA[index] = randsDouble;
          System.out.println(" "+index+" : " + arrayA[index]); 
         }
         
      for (int index = (arrayA.length - 1); index <= 0;index--)
         {
          
          int intVal = (int) arrayA[index]; 
            if(arrayA[index]%2==0)
            {
               String e = ("E");
               int i = 1;
               while (i < intVal)
                {
                e += "E"; 
                i++; 
                }
                System.out.println(" "+index+" : " + e + arrayA[index]);
            }

            else
            {
                String o = ("O");
                int i = 1;
                while (i < intVal)
                {
                 o += "O"; 
                 i++; 
                }
                System.out.println(" "+index+" : " + o + arrayA[index]);
            }
            
         }
     } // end method main 
    
   
    } // end class 