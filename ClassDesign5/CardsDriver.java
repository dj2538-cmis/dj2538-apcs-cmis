package ClassDesign5;

public class CardsDriver
  {
   public static void main( String[] args )
     {
      String[] myHand = new String[3];
      String[] cards = {"2","3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
      String[] cardsid = {"spade", "diamond", "heart", "clubs"};
      
     
     
      for( int i = 0; i < myHand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       myHand[i] = cards[a] + cardsid[b];
       System.out.println(myHand);
     } 
      
     }
     
    }