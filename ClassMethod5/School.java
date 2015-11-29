package ClassMethod5;

public class School 
{
  public static void main( String[] args )
    {
      String school1 = new String( "UC Irvine" );
      String school2 = new String( "California State Long Beach" );
      String school3 = new String( "UC Riverside" );
      
      System.out.println(school1.compareTo(school2) );
    }// School Test
    
  // a. What the method is giving us is a "18". What it means is that that the beginning letter of UC Irvine which is 
  //    "U" comes 18 letters after the beginning letter of California State Long beach being "C".
  
  // b. When the first letter is the same and the second letter is different, the method then compares the second
  //    letters. In my case I have UC Irvine and UC Riverside the first two letters are the same so it goes right to
  //    the third letter. It prints out a "-9" if I compare UC Irvine with UC Riverside, because "I" comes letters 
  //    before "R".
}