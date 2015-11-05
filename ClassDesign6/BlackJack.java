package ClassDesign6;

public class BlackJack 
    {
        private String number;
        private String suit;
        
        
        public BlackJack()
          {
           number = "7";
           suit = "Spades";
          } // end constructor Classsong
          
        public BlackJack(String number, String suit)
          {
          this.number = number;
          this.suit = suit;
          } // another constructor 
      
        
        public String toString()
          {
              String output = number + suit;
              return output;
          }
    }
    