package ClassMethodBigProblem;

public class SimpleCardDriver
  {
   public static void main( String[] args )
     {
      SimpleCard[] myHand = new SimpleCard[52];
      String[] rank = {"2 of ","3 of ","4 of ", "5 of", "6 of ", "7 of ", "8 of ", "9 of "
                        , "10 of ", "J of ", "Q of ", "K of ", "A of "};
      String[] suit = {" Spades", " Diamonds", " Hearts", " Clubs"};
      
     
     for( int i = 0; i < myHand.length; i++)
     {
      myHand[i] = new SimpleCard(suit[i%4], rank[i%13]);
      System.out.println(myHand[i]);
     } // %
     
     System.out.println("\n"); 
     
     for( int i = 0; i == 5; i++)
     {
     System.out.println(Math.random() * SimpleCard); 
     } // %
     
      
     
     
      
     }
     
    }