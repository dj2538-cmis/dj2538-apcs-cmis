package Fundemental7;

public class FundamentalP7
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        int positive=0;
        int negative=0;
        
        for (int index = 0; index < numbers.length;index++)
        {
            int random=(int)(Math.random()*100);
            
           
            if(random%2==0)
            {
                numbers[index] = (int)((Math.random()*100));
                positive++;
                negative++;
                

            }

            else
            {
                numbers[index] = (int)((Math.random()*100)*-1);
                negative++;
                positive++;
            }
        }  

        int index= 0;
        while(index<10)
        {
            System.out.println(numbers[index]);
            index++;
        }
        
        
        for(int random=0 ; random < numbers.length ; random++ )
        {
            if (numbers[random] > 0)
            {
                System.out.print(numbers[random] + " ");
                
                
            }
           
        }
        
        System.out.println("Positive numbers:"+positive);
        

    }
}