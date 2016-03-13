package Inheritance.Inheritance4;

public abstract class Student
   {
    private String firstname;
    private String major;
    private int units;
    
    public Student( String firstname, String major, int units)
       {
        this.firstname = firstname;
        this.major = major;
        this.units = units; 
       } // multi-constructor
       
    public void setfirstname(String firstname)
       {
        this.firstname = firstname;   
       } //set name
       
    public String getfirstname()
       {
        return firstname;    
       } //get name 
       
    public void setmajor(String major)
       {
        this.major = major;   
       } //set major
       
    public String getmajor()
       {
        return major;    
       } //get major   
       
    public void setunits(int units)
       {
        this.units = units;   
       } //set units
       
    public int getunits()
       {
        return units;    
       } //get units
       
    public String toString()
       {
        String output = new String();   
        output = "First name: " + firstname + "\n" +
                 "Major: " + major + "\n" +
                 "Units: " + units + "\n"; 
        return output;
       } // end toString 
       
       
   } // end class 
