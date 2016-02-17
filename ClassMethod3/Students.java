package ClassMethod3;
 
public class Students
    {
        private String firstname;
        private String lastname;
        private int age;
        private double weight;
        private int gradYear;
        private double[] classGrades = new double[5];
        
        public Students()
          {
          firstname = "Nikshay";
          lastname = "Kukreja";
          age = 17;
          weight = 65.5;
          gradYear = 2016;
          } // end constructor CMISstudents
     
          
        public Students( String firstname, String lastname, int age, double weight, int gradYear)
          {
           this.firstname = firstname;
           this.lastname = lastname;
           this. age = age;
           this.weight = weight; 
           this.gradYear = gradYear;
          } // another constructor 
          
        public double[] getclassGrades()
        {
         return classGrades; 
        }
        
        public void setGPA(double EnglishGrade,double MathGrade, double ScienceGrade, double FineArtsGrade,
                                   double SocialScienceGrade)
        {
         this.classGrades[0] = EnglishGrade;
         this.classGrades[1] = MathGrade;
         this.classGrades[2] = ScienceGrade;
         this.classGrades[3] = FineArtsGrade;
         this.classGrades[4] = SocialScienceGrade; 
        }
        
        public double calcGPA()
        {
         double total = 0.0;
         
         for(int i = 0; i < classGrades.length; i++)
         {
          total += classGrades[i];  
         }
         
         total /= classGrades.length;
         
         return total;
        }
          
        public String toString()
          {
           String output = new String();
           output = "First name : " +  firstname + "\n" +
           "Last name : " + lastname + "\n" +
           "Age : " +  age + "\n" +
           "Weight : " + weight + " kg"+ "\n" + 
           "Graduation year : " + gradYear + "\n" +
           "GPA average : " + calcGPA(); 
           return output; 
          }
    }
<<<<<<< HEAD
=======

>>>>>>> 77ef905eff0701fd6cf8e97585b011acfd04ef14
