package Inheritance.Inheritance4;
import java.util.ArrayList;

public class Driver
   {
    public static void main(String[] args)
       {
        UnderGrad under1 = new UnderGrad("Bob", "Superhero-ing", 10); 
        UnderGrad under2 = new UnderGrad("Ben", "Math-ing", 8); 
        Grad Grad1 = new Grad("Kevin", "Computer Science", 5); 
        Grad Grad2 = new Grad("John", "Science", 7);
        Post Post1 = new Post("Lisa", "Business", 3);
        Post Post2 = new Post("Gaara", "Ninja-ing", 1);
        
        ArrayList<Student> inventory = new ArrayList<Student>();
        inventory.add(under1);
        inventory.add(under2);
        inventory.add(Grad1);
        inventory.add(Grad2);
        inventory.add(Post1);
        inventory.add(Post2);
        
        Student[][] ArrayStudent = new Student[3][2];
        int x = 0; 
        
        for( int row = 0; row < ArrayStudent.length; row++)
           {
            for( int col = 0; col < ArrayStudent[0].length; col++)
               {
                ArrayStudent[row][col] = inventory.get(x);
                x++;
               } // end inner for
               
           } // end outer for
           
        for( int row = 0; row < ArrayStudent.length; row++)
           {
            for( int col = 0; col < ArrayStudent[0].length; col++)
               {
                System.out.print(ArrayStudent[row][col] + "\t\t\t");
               
               } // end inner for
            System.out.println();
           } // end outer for
        
        
       } // end void main
       
   } // end driver
