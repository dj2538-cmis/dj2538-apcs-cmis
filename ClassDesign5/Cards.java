package ClassDesign5;


public class Cards 
    {
        private int numberofcards;
        private int cardsgiven;
        private String myHand;
        
        public Cards()
          {
           numberofcards = 52;
           cardsgiven = 3;
          } // end constructor Classsong
          
        public Cards(int numberofcards, int cardsgiven)
          {
          this.myHand = myHand; 
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output =  myHand;
           return output; 
          }
    }
    