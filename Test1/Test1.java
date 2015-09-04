package Test1;
 
import javax.swing.JOptionPane; 

public class Test1 
    { 
     public static void main ( String args[] )
     {
       String input1 = JOptionPane.showInputDialog( "Please choose an integer"); 
       
       float[] randomNumbers = new float[5];
       for(int index = 0; index < randomNumbers.length;index++)
        {
            randomNumbers[index] = (int)(Math.random()*50 + 1);
        }
        
       for(int index = 0; index < randomNumbers.length;index++)
        {
           System.out.print(randomNumbers[index]+ " ");
        }
     } // end method main 
    
   
    } // end class Inputname