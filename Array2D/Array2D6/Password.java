package Array2D.Array2D6;
import javax.swing.JOptionPane;

public class Password
   {
    public static void main(String [] args)
       {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        
        int pass = 0;
        
        String convertLastName = lastName.toLowerCase();
        String convertPassword = password.toLowerCase();

        while(pass >= 0)
           {
            pass = convertPassword.indexOf(convertLastName);
            if(pass >= 0)
               {
                convertPassword = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
               }
            else
               {
                System.out.print("You have logged in");
               }
           }

       }
   }