package BIGPROBLEMONE;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class Histogram
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
    int occurances = 0;
    int numIndex = 0;
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
     if (hash.length() >= occurances)
     {
      occurances = hash.length();
      numIndex = i;
     }
     System.out.println(i + ":" + hash); 
    }
    
    Arrays.sort(rands);
    System.out.println("MIN : " + rands[0]);
    System.out.println("MAX : " + rands[rands.length-1]);
    int sum = 0;
     for(int index = 0; index < rands.length; index++)
    {
     sum += rands[index]; 
     
    }
    System.out.println("SUM : " + sum);
    float average = (float) sum / (float) rands.length;
    System.out.println("AVG : " + average);
    System.out.println("MST :" + numIndex); 
}
}