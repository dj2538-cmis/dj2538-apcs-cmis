package ClassDesign3;

public class CMISstudents
    {
        private String firstname;
        private String lastname;
        private int age;
        private double weight;
        
        public CMISstudents()
          {
          firstname = "Nikshay";
          lastname = "Kukreja";
          age = 17;
          weight = 65.5;
          } // end constructor CMISstudents
          
        public CMISstudents( String firstname, String lastname, int age, double weight)
          {
           this.firstname = firstname;
           this.lastname = lastname;
           this. age = age;
           this.weight = weight; 
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output = "First name : " +  firstname + "\n" +
           "Last name : " + lastname + "\n" +
           "Age : " +  age + "\n" +
           "Weight : " + weight + " kg"+ "\n"; 
           return output; 
          }
    }