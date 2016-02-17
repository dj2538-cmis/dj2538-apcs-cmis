package ClassMethod2;

public class ClockDriver
  {
   public static void main( String[] args )
     {
      Clock clock1 = new Clock();
      Clock clock2 = new Clock();
      Clock clock3 = new Clock();
      Clock clock4 = new Clock();
      System.out.println( clock1 );
      
      System.out.println("\n\n");
      clock1.setTimer(4, 4, 3);
      System.out.println( clock1);
      
      System.out.println("\n\n");
      clock2.setTimer(4, 4, 3);
      System.out.println("Day lgiht savings +1");
      clock2.converDaylightSavingplus(4); 
      System.out.println(clock2);
      
      System.out.println("\n\n");
      clock3.setTimer(4, 4, 3);
      System.out.println("Day lgiht savings -1");
      clock3.converDaylightSavingminus(4); 
      System.out.println(clock3);
      
      System.out.println("\n\n");
      clock4.setTimer(4, 4, 3);
      System.out.println("Total seconds");
      System.out.println(clock4);
  
     
      
      
     }
   
  }