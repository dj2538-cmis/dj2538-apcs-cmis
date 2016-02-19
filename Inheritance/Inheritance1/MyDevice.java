package Inheritance.Inheritance1;

public class MyDevice 
   {
    private String color;
    private double memory; // in GB
    private int size; // in centimeters
    
    MyDevice()
       {
        this.color = color;
        this.memory = memory;
        this.size = size;   
       } // end zero-args constructor 
       
    MyDevice( String color, double memory, int size )
       {
        this.color = "Blue";
        this. memory = 32.0;
        this.size = 10;
       } // end three args constructor
       
    public String toString()
       {
        String output = new String();
        output = "Device color: " + color + "\n" + 
                 " Device memory: " + memory + "\n" +
                 " Device size: " + size; 
                 
        return output; 
       } // end toString
       
   } // end class 