package Fundemental6;


public class FundamentalsP6
{
    public static void main(String[] args)
    {
        
        int[] randomNumbers = new int[50];
        for(int index = 0; index < randomNumbers.length;index++)
        {
            randomNumbers[index] = (int)(Math.random()*100);
        }
        
        for(int index = 0; index < randomNumbers.length;index++)
        {
           System.out.println(randomNumbers[index] + "\n");
        }
    }

}