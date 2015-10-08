package Classdesign2;
import javax.swing.JOptionPane; 

public class ClockDriver
  {
   public static void main( String[] args )
     {
      String hour = JOptionPane.showInputDialog( "Pick the hour"); 
      String min = JOptionPane.showInputDialog( "Pick the minutes"); 
      String sec = JOptionPane.showInputDialog( "Pick a seconds"); 
      
      int hour1 = Integer.parseInt( hour );
      int min1 = Integer.parseInt( min );
      int sec1 = Integer.parseInt( sec); 
      
      Clock clock1 = new Clock(); 
      Clock kitchenclock = new Clock(hour1, min1, sec1);
      
      System.out.println( clock1 );
      System.out.println(kitchenclock +" in the kitchen");
      
     
     }
   
  }