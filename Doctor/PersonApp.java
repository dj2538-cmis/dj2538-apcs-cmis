package Doctor;

public class PersonApp 
   {
    public static void main (String[] args)
       {
        Person[] People = new Person[3]; 
        People[0] = new Doctor("Nathan Kieffer", 1975, 4, 23);
        People[1] = new Person("Bradley Shank", 1943, 9, 21);
        
        for( Doctor D : People)
           {
            System.out.println( D + "\n" );  
           } // end for 
       } // end void main 
        
       
           
       
   } // end class 