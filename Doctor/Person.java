package Doctor;

public class Person
   {
    private String name;
    private int year;
    private int month;
    private int day;
    private int money;
    
    public Doctor(String name, int year, int month, int day, int money)
       {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day; 
        this.money = money
       }

    public String toString()
       {
        return String.format("Name: %s\nDate of birth: %s/%s/%s ", name, year, month, day);
       }

   }