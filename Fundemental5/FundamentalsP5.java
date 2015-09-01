package Fundemental5;

public class FundamentalsP5
{
   public static void main(String[] args)
    {
        String[] myMovie = {"Inside Out", "Guardians of the Galaxy","Up"};
        for(int index = 0;index< myMovie.length; index++ )
        {
            System.out.println(myMovie[index]);
        }
        
       System.out.println("\n"+"\n");
       String[] mySong= {"We Won't", "Moondust", "Shots"};
       int num= 0;
       
       while (num< mySong.length-1)
       {
           System.out.print(mySong[num]+",");
           num++;
       }
       System.out.print(mySong[mySong.length-1]);
    }
}