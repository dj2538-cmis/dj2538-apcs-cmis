package Inheritance.Inheritance1;

public class MyCreation extends MyDevice
   {
    private int cloud; // cloud storage
    private int ram; // GB
    
    MyCreation()
       {
        super();
        this.cloud = 100;
       } // end zero-args constructor 
       
    MyCreation( String color, double memory, int size, int cloud )
       {
        super(color, memory, size);
        this.cloud = cloud;
       } // end three args constructor
    
    public int getRam()
       {
        return ram; 
       } // end getRam
       
       
    public void setRam( int ram )
       {
        this.ram = ram;       
        } // end setRam
       
    public String toString()
       {
        String output = new String();
        output = super.toString() + "\n" + 
                 "Cloud storage: " + cloud + " GB" + "\n" +
                 "Ram : " + getRam() + " GB";
                 
        return output; 
       } // end toString
    
       
   } // end class