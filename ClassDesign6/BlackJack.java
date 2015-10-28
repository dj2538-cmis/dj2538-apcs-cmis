package ClassDesign6;

public class BlackJack 
    {
        private String number;
        private String suit;
        private String Hand;
        
        public BlackJack()
          {
           number = "7 of";
           suit = "Spades";
          } // end constructor Classsong
          
        public BlackJack(String number, String suit, String Hand)
          {
          this.number = number;
          this.suit = suit;
          this.Hand = Hand;
          } // another constructor 
          
        public String toString()
          {
              String output = number + suit;
              return output;
          }
    }
    