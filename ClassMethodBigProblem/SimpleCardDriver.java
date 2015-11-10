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
      for( int d = 0; d < rank.length; d++)
      {
       rank = new picked[d]; 
      }
     } 
     
      for( int i = 0; i < 5; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       myHand[i] = new SimpleCard(rank[b],suit[a]);
       System.out.println(myHand[i]);
     } 
     
      
     }
     
    }