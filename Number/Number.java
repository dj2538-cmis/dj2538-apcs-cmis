package Number;


import javax.swing.JOptionPane; 

public class Number
    { 
    public static void main ( String[] args )
        {
        float sum1 = 0;
        float dif1 = 0;
        float times1 = 0;
        float divide1 = 0;
        float modulus1 = 0;
         
         
        String input1 = JOptionPane.showInputDialog( "Pick a number"); 
        String input2 = JOptionPane.showInputDialog( "Pick another number"); 
      
        float num1 = Integer.parseInt( input1 );
        float num2 = Integer.parseInt( input2 );
       
        
        sum1 = num1 + num2; 
        System.out.println( +num1 + "+" + num2 + "=" +sum1 );
        System.out.println( +num2 + "+" + num1 + "=" +sum1 );
        
        dif1 = num1 - num2;
        System.out.println( +num1 + "-" + num2 + "=" +dif1); 
        dif1 = num2 - num1;
        System.out.println( +num2 + "-" + num1 + "=" +dif1); 
        
        times1 = num1 * num2;
        System.out.println( +num1 + "*" + num2 + "=" +times1);
        times1 = num2 * num1;
        System.out.println( +num2 + "*" + num1 + "=" +times1);
        
        divide1 = num1 / num2;
        System.out.println( +num1 + "/" + num2 + "=" +divide1); 
        divide1 = num2 / num1;
        System.out.println( +num2 + "/" + num1 + "=" +divide1); 
        
        modulus1 = num1 % num2;
        System.out.println( +num1 + "%" + num2 + "=" +modulus1);
        modulus1 = num2 % num1;
        System.out.println( +num2 + "%" + num1 + "=" +modulus1);
        
        
    } // end method main 
    
} // end class InputData