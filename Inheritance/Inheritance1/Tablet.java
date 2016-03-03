package Inheritance.Inheritance1;

public class Tablet extends MyDevice
   {
    private int screenspecs;
    private String company;
    
    Tablet()
       {
        super();
        this.screenspecs = 1080;
       } // end zero-args constructor 
       
    Tablet( String color, double memory, int size, int screenspecs )
       {
        super(color, memory, size);
        this.screenspecs = screenspecs;
       } // end three args constructor
    
    public String getcompany()
       {
        return company; 
       } // end getRam
       
       
    public void setCompany( String company )
       {
        this.company = company;       
        } // end setRam
       
    public String toString()
       {
        String output = new String();
        output = "Tablet" + "\n" + super.toString() + "\n" + 
                 "Screen specs: " + screenspecs + "p" + "\n" +
                 "Company : " + getcompany();
                 
        return output; 
       } // end toString
    
       
   } // end class