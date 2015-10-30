package ClassDesign6;

import javax.swing.JOptionPane; 

public class BlackJackDriver2
  {
   public static void main( String[] args )
     {
      String input1 = JOptionPane.showInputDialog( "Pick a number people to play");
      int num1 = Integer.parseInt( input1 );
       
      String[]Hand = new String[2]; 
         
      String[] cards = {"2 of ","3 of ","4 of ", "5 of", "6 of ", "7 of ", "8 of ", "9 of "
                        , "10 of ", "J of ", "Q of ", "K of ", "A of "};
      String[] cardsid = {" Spades", " Diamonds", " Hearts", " Clubs"};
      
      String[] player1 = new String[2];
      String[] player12 = new String[2];
      String[] player2 = new String[2];
      String[] player22 = new String[2];
      String[] player3 = new String[2];
      String[] player32 = new String[2];
      String[] player4 = new String[2];
      String[] player42 = new String[2];
      String[] player5 = new String[2];
      String[] player52 = new String[2];
      String[] dealer = new String[2];
      String[] dealer2 = new String[2];
      
     if(num1 == 1 )
    {
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
       player12[i] = cards[c] + cardsid[d];
       System.out.println("Player 1 : " + player1[i] + " and " + player12[i]);
      }
      
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       dealer[i] = cards[c] + cardsid[d];
       dealer2[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i] + " and " + dealer2[i]);
      }
    }
     
    if(num1 == 2)
    {
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
       player12[i] = cards[c] + cardsid[d];
       System.out.println("Player 1 : " + player1[i] + " and " + player12[i]);
      }
      
       for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player2[i] = cards[c] + cardsid[d];
       player22[i] = cards[a] + cardsid[b];
       System.out.println("Player 2 : " + player2[i] + " and " + player22[i]);
      }
      
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       dealer[i] = cards[c] + cardsid[d];
       dealer2[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i] + " and " + dealer2[i]);
      }
    }
    
    if(num1 == 3)
    {
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
       player12[i] = cards[c] + cardsid[d];
       System.out.println("Player 1 : " + player1[i] + " and " + player12[i]);
      }
        
       for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player2[i] = cards[c] + cardsid[d];
       player22[i] = cards[a] + cardsid[b];
       System.out.println("Player 2 : " + player2[i] + " and " + player22[i]);
      }
      
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player3[i] = cards[c] + cardsid[d];
       player32[i] = cards[a] + cardsid[b];
       System.out.println("Player 3 : " + player3[i] + " and " + player32[i]);
      }
      
       for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       dealer[i] = cards[c] + cardsid[d];
       dealer2[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i] + " and " + dealer2[i]);
      }
    }
   
    if(num1 == 4)
      {
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player1[i] = cards[a] + cardsid[b];
       player12[i] = cards[c] + cardsid[d];
       System.out.println("Player 1 : " + player1[i] + " and " + player12[i]);
      }
        
       for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player2[i] = cards[c] + cardsid[d];
       player22[i] = cards[a] + cardsid[b];
       System.out.println("Player 2 : " + player2[i] + " and " + player22[i]);
      }
      
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player3[i] = cards[c] + cardsid[d];
       player32[i] = cards[a] + cardsid[b];
       System.out.println("Player 3 : " + player3[i] + " and " + player32[i]);
      }
      
      for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player4[i] = cards[c] + cardsid[d];
       player42[i] = cards[a] + cardsid[b];
       System.out.println("Player 4 : " + player4[i] + " and " + player42[i]);
      }
      
       for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       dealer[i] = cards[c] + cardsid[d];
       dealer2[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i] + " and " + dealer2[i]);
      }
          
      }
      
    if(num1 == 5 )
      {
     for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player2[i] = cards[c] + cardsid[d];
       player22[i] = cards[a] + cardsid[b];
       System.out.println("Player 2 : " + player2[i] + " and " + player22[i]);
      }
      
     for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player3[i] = cards[c] + cardsid[d];
       player32[i] = cards[a] + cardsid[b];
       System.out.println("Player 3 : " + player3[i] + " and " + player32[i]);
      }
      
     for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player4[i] = cards[c] + cardsid[d];
       player42[i] = cards[a] + cardsid[b];
       System.out.println("Player 4 : " + player4[i] + " and " + player42[i]);
      }
      
     for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       player5[i] = cards[c] + cardsid[d];
       player52[i] = cards[a] + cardsid[b];
       System.out.println("Player 5 : " + player5[i] + " and " + player52[i]);
      }
      
     for( int i = 1; i < Hand.length; i++)
      {
       int a = ((int) (Math.random()*13));
       int b = ((int) (Math.random()*4));
       int c = ((int) (Math.random()*13));
       int d = ((int) (Math.random()*4));
       dealer[i] = cards[c] + cardsid[d];
       dealer2[i] = cards[a] + cardsid[b];
       System.out.println("Dealer : " + dealer[i] + " and " + dealer2[i]);
      }
      
    }
     }
     }
    