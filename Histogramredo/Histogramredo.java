package Histogramredo;

import javax.swing.JOptionPane;
import java.util.Random;

public class Histogramredo
{
    public static void main (String[] args)
    {
      String user = JOptionPane.showInputDialog("Input an integer: ");
      int userInt = Integer.parseInt(user);
      int[] rands = new int[userInt];
      Random random = new Random(); 
      for (int index = 0; index < rands.length; index++)
      {
       rands[index] = random.nextInt((99-0) + 0);
       System.out.println(rands[index]);
      }
      int[] count = new int[100]; 
      for (int index = 0; index < rands.length; index++)
      {
       count[rands[index]] += 1;   
      }
      int occurances = 0;
      int numIndex = 0;
      for (int index = 0; index < count.length; index++)
      {
       int ctr = 0; 
       String hash = ""; 
       while (ctr < count[index])
       {
        hash += "#";
        ctr++;
       }
       if (hash.length() >= occurances)
       {
        occurances = hash.length();
        numIndex = index;
       }
       System.out.println(index + ": " + hash);
      }
      int occur = 0;
      for (int index = 0; index < rands.length; index++)
      {
       if (rands[index] > occur)
       {
        occur = rands[index];
       }
      }
      int nOccur = occur;
      for (int index = 0; index < rands.length; index++)
      {
        if (rands[index] < nOccur)
        {
        nOccur = rands[index];
        }
      }
      System.out.println("MAX : " + occur);
      System.out.println("MIN : " + nOccur);
      int sum = 0;
      for (int index = 0; index < rands.length; index++)
      {
       sum += rands[index];
      }
      System.out.println("SUM : " + sum);
      float avg = (float) sum / (float) (rands.length);
      System.out.println("AVG : " + avg);
      System.out.println("MST : " + numIndex);
        
    }
}