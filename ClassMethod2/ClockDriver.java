package ClassMethod2;

public class ClockDriver
  {
   public static void main( String[] args )
     {
      Clock clock1 = new Clock();
      System.out.println( clock1 );
      
      System.out.println("\n\n");
      clock1.setTimer(4, 4, 3);
      System.out.println( clock1);
      
      System.out.println("\n\n");
      System.out.println("Day lgiht savings +1");
      clock1.converDaylightSavingplus(4); 
      System.out.println(clock1);
      
      System.out.println("\n\n");
      System.out.println("Day lgiht savings -1");
      clock1.converDaylightSavingminus(4); 
      System.out.println(clock1);
      
      System.out.println("\n\n");
      System.out.println("Total seconds");
  
     
      
      
     }
   
  }