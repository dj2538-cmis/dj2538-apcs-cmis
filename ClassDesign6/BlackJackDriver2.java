package ClassDesign6;

public class BlackJackDriver2
  {
   public static void main( String[] args )
     {
      
      String[]Hand = new String[2]; 
         
      String[] cards = {"2 of ","3 of ","4 of ", "5 of", "6 of ", "7 of ", "8 of ", "9 of "
                        , "10 of ", "J of ", "Q of ", "K of ", "A of "};
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"};
      
      String[] player1 = new String[2];
      String[] player2 = new String[2];
      String[] player3 = new String[2];
      String[] player4 = new String[2];
      String[] player5 = new String[2];
      String[] player6 = new String[2];
      String[] dealer = new String[2];
      
     
     
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
      System.out.println("Player 1 : " + player1[i]);
      System.out.println("Player 1 : " + player1[i]); 
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player2[i] = cards[c] + cardsid[d];
       System.out.println("Player 2 : " + player2[i]);
       
       
     } 
      
     }
     
    }