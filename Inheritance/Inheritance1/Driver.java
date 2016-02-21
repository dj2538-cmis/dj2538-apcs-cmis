package Inheritance.Inheritance1;
import java.util.ArrayList;

public class Driver
   {
    public static void main(String args[])
       {
        MyCreation creation1 = new MyCreation();
        creation1.setRam(8);
       
        ArrayList<MyDevice> inventory = new ArrayList<MyDevice>();
        inventory.add(creation1);
        
        for(MyDevice d : inventory)
           {
           System.out.println(d);    
               
           }
           
       } // end void main
       
       
   } // end class