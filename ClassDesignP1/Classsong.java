package ClassDesignP1;

public class Classsong 
    {
        private String Genre;
        private String Artist;
        private String Song;
        
        public Classsong()
          {
           Genre = new String ("Alternative");
           Artist = new String ("Coldplay");
           Song = new String ("Paradise"); 
          } // end constructor Classsong
          
        public Classsong(String Genre, String Artist, String Song)
          {
           this.Genre = new String( Genre );
           this.Artist = new String( Artist);
           this. Song = new String( Song );
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "Genre is: " + Genre + "\n" +
                    "Artist is: " + Artist + "\n" +
                    "Song is: " + Song + "\n"; 
           return output; 
          }
    }
    