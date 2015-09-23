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
      
      System.out.println("Days \t" + "temperature \t" + "Temperature swing from previous day \t" + "Description");
      for (int index = 0; index < days.length; index++)
      {
       days[index] = (int) (Math.random() * 200) - 100;
       System.out.println( "\t" + days[index]);
      }
      
        
    }
}