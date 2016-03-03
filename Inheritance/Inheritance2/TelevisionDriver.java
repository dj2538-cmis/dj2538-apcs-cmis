package Inheritance.Inheritance2;

public class TelevisionDriver
   {
    public static void main(String[] args)
       {
        Television[] TV = new Television[5];
        TV[0] = new Television("Sony", 200.00);
        TV[1] = new DLP("Samsung DLP", 150.00);
        TV[2] = new LED("Panasonic LED", 500.00);
        TV[3] = new LCD("Lenovo", 5000.00);
        TV[4] = new Plasma("HP Plasma", 81525.26);
    
        for ( Television tv : TV )
           {
            System.out.println(tv);
           }     
       }
   }
