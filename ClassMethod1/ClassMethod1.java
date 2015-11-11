package ClassMethod1;

public class ClassMethod1
    {
        private String Genre;
        private String Artist;
        private String Song;
        private int yearReleased;
        private int SongLength; 
        
        public ClassMethod1()
          {
           Genre = new String ("Alternative");
           Artist = new String ("Coldplay");
           Song = new String ("Paradise");
           SongLength = 131; 
          } // end constructor Classsong
          
        public int calSongLength()
          {
           int total = SongLength % 60;
           return total;
          }
          
        public int calSongLength2()
          {
           int total = SongLength / 60;
           return total;
          }
          
        public int getYearReleased()
          {
           return yearReleased;   
          }// get yearRelased
          
        public void setYearReleased(int released)
          {
           this.yearReleased = released; 
          }// get yearRelased
          
        public ClassMethod1(String Genre, String Artist, String Song, int SongLength)
          {
           this.Genre = new String( Genre );
           this.Artist = new String( Artist);
           this.Song = new String( Song );
           this.SongLength = SongLength;
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "Genre is: " + Genre + "\n" +
                    "Artist is: " + Artist + "\n" +
                    "Song is: " + Song + "\n" + 
                    "The length of the song is: " + 
                     calSongLength2() + " minutes " + " and " 
                     + calSongLength() + " seconds." + "\n \n";
                     
           return output; 
          }
    }
