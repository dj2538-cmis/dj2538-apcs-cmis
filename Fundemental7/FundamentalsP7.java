package Fundemental7;

public class FundamentalsP7
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        for (int index = Math.random(); index < numbers.length;index++)
        {
            numbers[index] = (int)((Math.random()*10)*-1);
        }
        int index= 0;
        while(numbers[index] < 100)
        {
            System.out.println(numbers[index]); 
            index++;
        }
        
    }

}