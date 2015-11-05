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
      
      String[] cards = {"2","3","4", "5", "6", "7", "8", "9"
                        , "10", "J", "Q", "K", "A"};
                        
      int[] dealervalue = {2,3,4,5,6,7,8,9,10,10,10,10,11};
      int[] value = {2,3,4,5,6,7,8,9,10,10,10,10,11};
      int score = 0;
      int dealerscore = 0;
      String winner = "";
      String loser = "";
                        
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"}; 
      
      
      
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       dealercard[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Dealer : " + dealercard[i]);
       dealerscore += dealervalue[a];
       
      }//dealer
      
      System.out.println("Value : " + dealerscore);
       
      System.out.println("\n");
      score = 0;
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       card1[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Player1 : " + card1[i]);
       score += value[a];
        
      }//player1
      
      
      System.out.println("Value : " + score);
      if(score == 21)
        {
         winner = "winner";    
        }
      if(score < 21)
        {
         loser = "loser";    
        }
      System.out.println(winner);
      System.out.println(loser);
      
      System.out.println("\n");
      score = 0;
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       card2[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Player2 : " + card2[i]);
       score += value[a];
        
      }//player2
      
      System.out.println("Value : " + score);
      System.out.println(winner);
      System.out.println(loser);
      
      System.out.println("\n");
      score = 0; 
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       card3[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Player3 : " + card3[i]);
       score += value[a];
        
      }// player3
      
      System.out.println("Value : " + score);
      System.out.println(winner);
      System.out.println(loser);
      
      System.out.println("\n");
      score = 0;
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       card4[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Player4 : " + card4[i]);
       score += value[a];
        
      }//player4
      
      System.out.println("Value : " + score);
      System.out.println(winner);
      System.out.println(loser);
      
      System.out.println("\n");
      score = 0;
      for( int i = 0; i < dealercard.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       card5[i] = new BlackJack(cards[a],cardsid[b]);
       System.out.println("Player5 : " + card5[i]);
       score += value[a];
        
      }//player5 
      
      System.out.println("Value : " + score);
      System.out.println(winner);
      System.out.println(loser);
      
      
      
    
     }
     
     
}    