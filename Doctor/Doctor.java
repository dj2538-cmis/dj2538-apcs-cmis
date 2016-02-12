package Doctor;

public class Doctor extends Person
   {
    private String name;
    private int year;
    private int month;
    private int day; 
    
    public Doctor(String name, int year, int month, int day)
       {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day; 
       }

    public String toString()
       {
        return String.format("Name: %s\nDate of birth: %s/%s/%s ", name, year, month, day);
       }

   }