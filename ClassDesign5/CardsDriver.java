package ClassDesign5;

public class CardsDriver
  {
   public static void main( String[] args )
     {
      String[] myHand = new String[3];
      String[] cards = {"2 of ","3 of ","4 of ", "5 of", "6 of ", "7 of ", "8 of ", "9 of "
                        , "10 of ", "J of ", "Q of ", "K of ", "A of "};
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"};
      
     
     
      for( int i = 0; i < myHand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       myHand[i] = cards[a] + cardsid[b];
       System.out.println(myHand[i]);
     } 
      
     }
     
    }