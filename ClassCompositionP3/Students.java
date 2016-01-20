package ClassCompositionP3;

public class Students
   {
    private String firstname;
    private String lastname;
    private String LetterGrade;
    private int age;
    private int gradYear;
    private double weight;
    private double total = 0.0;  
    private double[] classGrades = new double[5];
            
    public Students()
       {
        firstname = "Nikshay";
        lastname = "Kukreja";
        age = 17;
        weight = 65.5;
        gradYear = 2016;
        LetterGrade = "";
       } // end constructor CMISstudents
         
    public Students( String firstname, String lastname, int age, double weight, int gradYear, String LetterGrade
                    ,double EnglishGrade,double MathGrade, double ScienceGrade, double FineArtsGrade,
                                   double SocialScienceGrade)
       {
        this.firstname = firstname;
        this.lastname = lastname;
        this. age = age;
        this.weight = weight; 
        this.gradYear = gradYear;
        this.LetterGrade = LetterGrade;
        this.classGrades[0] = EnglishGrade;
        this.classGrades[1] = MathGrade;
        this.classGrades[2] = ScienceGrade;
        this.classGrades[3] = FineArtsGrade;
        this.classGrades[4] = SocialScienceGrade; 
       } // another constructor 
          
    public double[] getclassGrades()
       {
        return classGrades; 
       }
             
   
    public double calcGPA()
      {
         
       for(int i = 0; i < classGrades.length; i++)
          {
          total += classGrades[i];  
          }
         
       total /= classGrades.length;
         
       return total;
       }
           
    public String calcLetter()
       {
         if(total >= 4.0) 
            {
             LetterGrade = "A";
            }
         if(total >= 3.0 && total < 4.0)
            {
             LetterGrade = "B"; 
            }
         if(total >= 2.0 && total < 3.0)
            {
             LetterGrade = "C";
            }
         if(total >= 1.0 && total < 2.0)
            {
             LetterGrade = "D";
            }
         if(total < 1.0)
            {
             LetterGrade = "F";         
            }
         
         return LetterGrade;
       }// LetterGrade Processor 
        
    public String toString()
       {
        String output = new String();
        output = "First name : " +  firstname + "\n" +
        "Last name : " + lastname + "\n" +
        "Age : " +  age + "\n" +
        "Weight : " + weight + " kg"+ "\n" + 
        "Graduation year : " + gradYear + "\n" +
        "GPA average : " + calcGPA() + "\n" +
        "Your grade : " + calcLetter(); 
        return output; 
       }
    }


