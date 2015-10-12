package ClassDesign4;

public class ClassDesign4
    {
        private String Movie;
        private int Budget;
        private int Profit;
        
        public ClassDesign4()
          {
           Movie = new String ("The Martian");
           Budget = 5000000;
           Profit = 200000000;
          } // end constructor Classsong
          
        public ClassDesign4(String Movie, int Budget, int Profit)
          {
           this.Movie = new String( Movie );
           this.Budget = Budget;
           this.Profit = Profit;
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "Movie is: " + Movie + "\n" +
                    "Budget: " + Budget + "\n" +
                    "Profit: " + Profit + "\n"; 
           return output; 
          }
    }