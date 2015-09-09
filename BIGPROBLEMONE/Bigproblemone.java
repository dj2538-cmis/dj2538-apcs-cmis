package BIGPROBLEMONE;

import javax.swing.JOptionPane;
import java.util.Random;

public class Bigproblemone
{
    public static void main (String[] args)
    {
    String user = JOptionPane.showInputDialog("Pick an integer");
    int userint = Integer.parseInt(user);
    int[] rands = new int[userint];
    
    for(int index = 0; index < rands.length; index++)
    {
     Random rand = new Random(); 
     int randNum = rand.nextInt((99 - 0) +0);
     rands[index] = randNum; 
     System.out.println(rands[index]);
    }
        
    int[] repeat = new int[userint];
    for(int i = 0; i <= 99; i++)
    {
     String hash = "";
     for(int index = 0; index < rands.length; index++)
     {
      if(rands[index] == i)
      {
       hash += "#";
          
      }
         

     }   
     System.out.println(i + ":" + hash); 
    }
    
    }
}