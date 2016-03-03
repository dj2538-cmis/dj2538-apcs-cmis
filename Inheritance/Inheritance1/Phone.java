package Inheritance.Inheritance1;

public class Phone extends MyDevice
   {
    private int cloud; // cloud storage
    private int ram; // GB
    private String carrier;
    
    Phone()
       {
        super();
        this.cloud = 100;
        this.carrier = "Dtac";
       } // end zero-args constructor 
       
    Phone( String color, double memory, int size, int cloud, String carrier )
       {
        super(color, memory, size);
        this.cloud = cloud;
        this.carrier = carrier;
        
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
        output = "Phone" + "\n" + super.toString() + "\n" + 
                 "Cloud storage: " + cloud + " GB" + "\n" +
                 "Ram : " + getRam() + " GB" +"\n" ;
                 
        return output; 
       } // end toString
    
       
   } // end class