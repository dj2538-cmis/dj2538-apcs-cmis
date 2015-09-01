package Fundemental7;

public class FundamentalsP7
{
    public static void main(String[] args)
    {
     int[] numbers = new int[10];
     for (int index = 0; index < numbers.length;index++)
        {
        numbers[index] = (int)((Math.random()*201)-100);
        }
    
     int index= 0;
     while(index < 10)
        {
         System.out.println(numbers[index]); 
         index++;
        }
    }
}