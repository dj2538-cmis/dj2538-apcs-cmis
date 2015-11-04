package ClassDesign6;

import javax.swing.JOptionPane; 

public class BlackJackDriver2
  {
   public static void main( String[] args )
     {
      BlackJack card1[] = new BlackJack[2]; 
      BlackJack card2[] = new BlackJack[2]; 
      BlackJack card3[] = new BlackJack[2]; 
      BlackJack card4[] = new BlackJack[2]; 
      BlackJack card5[] = new BlackJack[2]; 
      BlackJack dealercard[] = new BlackJack[2]; 
      number Number[] = new BlackJack[13];
      
      number[] cards = {"2","3","4", "5", "6", "7", "8", "9"
                        , "10", "J", "Q", "K", "A"};
                        
      int value[] = {1,2,3,4,5,6,7,8,9,10,11};
                        
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"}; 
      
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       dealercard[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealercard[i]);
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
      
      
      
       
      
      
      
      
    
     }
     }
    