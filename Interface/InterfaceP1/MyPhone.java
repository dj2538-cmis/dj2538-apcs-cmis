package Interface.InterfaceP1;

public class MyPhone extends MyDevices
   {
    private String carrier;
    
    public MyPhone()
       { 
        super();
        this.carrier = new String ("none");
       } // end one-constructor
       
    public MyPhone(int memory, String color, String carrier)
       {
        super();
        this.carrier = new String(carrier); 
       } // end one-constructor
       
    public void connectobluetooth()
       {
        System.out.println( "Connecting to bluetooth for my phone" );   
       } // end method
       
    public String toString()
       {  
        return super.toString() + "\n" +
               "This phone's carrier is: " + carrier; 
       } // end toString 
   } // end class 