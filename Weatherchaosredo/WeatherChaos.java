package Weatherchaosredo;

import javax.swing.JOptionPane;
import java.util.Random;

public class WeatherChaos
{
    public static void main (String[] args)
    {
      String user = JOptionPane.showInputDialog("Pick a number : ");
      int userInt = Integer.parseInt(user);
      int[] days = new int[userInt];
      String cold = "";
      int swing = 0;
      int b = 0;
      System.out.println("Days \t" + "temperature \t" + "Temperature swing from previous day \t" + "Description");
      
     if (userInt >= 0 && userInt <= 31)
     {
         for (int index = 0; index < days.length; index++)
       {
            days[index] = (int) (Math.random() * 200) - 100;
            
          if (days[index] <= 0)
          {
           cold = "freezing";    
           //System.out.println("\t" + "\t" + "\t"+ "\t" + "\t"  + "\t"  + "\t"  + "\t"+cold);
           }
           
          if(0 < days[index] && days[index] <= 15)
          {
           cold = "chilly";   
           //System.out.println("\t" + "\t" + "\t"+ "\t" + "\t"  + "\t"  + "\t"  + "\t"+"chilly");
           }
           
          if(16 < days[index] && days[index] <= 30)
          {
              cold = "comfortable";
           //System.out.println("\t" + "\t" + "\t"+ "\t" + "\t"  + "\t"  + "\t"  + "\t"+"comfortable");
          }
          
          if(31 < days[index] && days[index] <= 40)
          {
              cold = "hot";
           //System.out.println("\t" + "\t" + "\t"+ "\t" + "\t"  + "\t"  + "\t"  + "\t"+"hot");
          }
          
          if(days[index] >= 41)
          {
              cold = "AAAAAUUUGGGHHH!";
           //System.out.println("\t" + "\t" + "\t"+ "\t" + "\t"  + "\t"  + "\t"  + "\t"+"AAAAAUUUGGGHHH!");
          }
          
          for (int a =0; a <days.length; a++)
          {
              b = days[index - 1];
            }
          System.out.print(index + 1 + "\t" + days[index] + "\t" + "\t"+ "\t" + days[b] + "\t"+ "\t"+ "\t"+ "\t"+ cold + "\n");
       }
       
       
       int occur = 0;
       for (int index = 0; index < days.length; index++)
       {
        if (days[index] > occur)
        {
         occur = days[index];
        }
       }
       int nOccur = occur;
       for (int index = 0; index < days.length; index++)
       {
         if (days[index] < nOccur)
         {
         nOccur = days[index];
         }
       }
       System.out.println("MAX : " + occur);
       System.out.println("MIN : " + nOccur);
       int sum = 0;
       for (int index = 0; index < days.length; index++)
       {
        sum += days[index];
       }
       float avg = (float) sum / (float) (days.length);
       System.out.println("AVG : " + avg);
      
        }
     else
     {
         System.out.println("Bro that's not a legit number of days");
        }
      }
}