package ClassDesign6;

import javax.swing.JOptionPane; 

public class BlackJackDriver2
  {
   public static void main( String[] args )
     {
      String[] cards = {"2 of ","3 of ","4 of ", "5 of", "6 of ", "7 of ", "8 of ", "9 of "
                        , "10 of ", "J of ", "Q of ", "K of ", "A of "};
                        
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"};

      String[] player1 = new String[3];
      String[] player2 = new String[3];
      String[] player3 = new String[3];
      String[] player4 = new String[3];
      String[] player5 = new String[3];
      String[] dealer = new String[3];
      
      
      for( int i = 1; i < dealer.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       dealer[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i]);
      }
      
      System.out.println("\n");
    
      for( int i = 1; i < player1.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
       System.out.println("Player 1 : " + player1[i]);
      }
      
      System.out.println("\n");
      
      for( int i = 1; i < player2.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player2[i] = cards[a] + cardsid[b];
       System.out.println("Player 2 : " + player2[i]);
      }
      
      System.out.println("\n");
      
      for( int i = 1; i < player3.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player3[i] = cards[a] + cardsid[b];
       System.out.println("Player 3 : " + player3[i]);
      }
      
      System.out.println("\n");
      
      for( int i = 1; i < player4.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player4[i] = cards[a] + cardsid[b];
       System.out.println("Player 4 : " + player4[i]);
      }
      
      System.out.println("\n");
      
      for( int i = 1; i < player5.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       player5[i] = cards[a] + cardsid[b];
       System.out.println("Player 5 : " + player5[i]);
      }
      
      System.out.println("\n"); 
      
      System.out.println(two);
      
       
      
      
      
      
    
     }
     }
    