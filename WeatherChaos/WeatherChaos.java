package WeatherChaos;

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
      
       System.out.println("Days \t" + "temperature \t" + "Temperature swing from previous day \t" + "Description");
    for (int index = 0; index < days.length; index++)
       {
       days[index] = (int) (Math.random() * 200) - 100;
       }
     
      for (int index = 0; index < days.length; index++)
      {
        
        if (userInt > 0 && userInt < 31)
        {
           System.out.println(index +1);
           System.out.println( "\t" + days[index]);
           
        }
        
        else 
        {
         System.out.println("INVALID!!!");    
        }
        
     }
     
     for (int index = 0; index < days.length; index++)
     {
      if (userInt <= 0)
      {
       cold = "freezing";    
      }
      System.out.println("\t" + cold); 
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
}