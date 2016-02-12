package Array2D.Array2D5;

public class JukeboxDriver
   {
    public static void main(String[] args)
       {
        Jukebox Songs = new Jukebox();
        System.out.println(Songs);
        System.out.println("Random song: " + Songs.randomSong());
        System.out.println("Songs with the rating of 1: " + Songs.playSongofRating(1));
       }
   } 