package ClassCompositionP6;

public class Students
   {
    private String firstname;
    String lastname;
    private double gpa;
            
    public Students()
       {
        this.firstname = "Nikshay";
        this.lastname = "Kukreja";
        this.gpa = 2.6;
       } // end constructor CMISstudents
         
    public Students( String firstname, String lastname, double gpa)
       {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
       } // another constructor
       
    public double getGPA()
       {
        return this.gpa;    
       }
       
    public String getName()
       {
        return this.firstname + this.lastname;     
       }
        
    public String toString()
       {
        String output = new String();
        output = "First name : " +  firstname + "\n" +
        "Last name : " + lastname + "\n" +
        "GPA: " + gpa; 
        return output; 
       }
    }




