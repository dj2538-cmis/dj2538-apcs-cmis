package Inheritance.Inheritance1;
import java.util.ArrayList;

public class Driver
   {
    public static void main(String args[])
       {
        Phone Phone1 = new Phone();
        Phone1.setRam(8);
        
        Tablet Tablet1 = new Tablet();
        Tablet1.setCompany("Apple");
        
        MyCreation MyCreation1 = new MyCreation();
        MyCreation1.setcorespeed(100);
        
        ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
        inventory.add(Phone1);
        inventory.add(Tablet1);
        inventory.add(MyCreation1);
        
        for(MyDevice d : inventory)
           {
           System.out.println(d);    
               
           }
           
       } // end void main
       
       
   } // end class