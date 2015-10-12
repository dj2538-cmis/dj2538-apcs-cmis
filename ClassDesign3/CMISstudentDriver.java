package ClassDesign3;
import javax.swing.JOptionPane; 

public class CMISstudentDriver
  {
   public static void main( String[] args )
     {
      String firstname = JOptionPane.showInputDialog( "Junior's first name : "); 
      String lastname = JOptionPane.showInputDialog( "Junior's last name : "); 
      String age = JOptionPane.showInputDialog( "Junior's age : ");
      String weight = JOptionPane.showInputDialog( "Junior's weight : "); 
      
      int age1 = Integer.parseInt( age );
      double weight1 = Integer.parseInt( weight );

      CMISstudents senior001 = new CMISstudents(); 
      CMISstudents junior001 = new CMISstudents(firstname, lastname, age1, weight1);
      
      JOptionPane.showMessageDialog(null, senior001, "CMIS students", JOptionPane.PLAIN_MESSAGE); 
      JOptionPane.showMessageDialog(null, junior001, "CMIS students", JOptionPane.PLAIN_MESSAGE); 
     
      
     
     }
   
  }