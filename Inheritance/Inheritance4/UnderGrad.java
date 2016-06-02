package Inheritance.Inheritance4;

public class UnderGrad extends Student
   {
    public UnderGrad(String firstname, String major, int units)
       {
        super(firstname, major, units);   
       } // end constructor
       
    public int calulateTuition()
       {
        return getunits() * 250;    
       } // end caltuition
       
    public String toString()
       {
        return super.toString();  
       } // end toString 
       
    
   } // end class 

   List<String> human = new 