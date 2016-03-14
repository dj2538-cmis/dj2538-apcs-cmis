package Inheritance.Inheritance4;

public class Post extends Student
   {
    public Post(String firstname, String major, int units)
       {
        super(firstname, major, units);   
       } // end constructor
       
    public int calulateTuition()
       {
        return getunits()*750;    
       } // end caltuition
       
    public String toString()
       {
        return super.toString();  
       } // end toString 
       
    
   } // end class 
