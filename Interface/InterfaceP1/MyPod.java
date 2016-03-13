package Interface.InterfaceP1;

public class MyPod extends MyDevices
   {
    
    public MyPod()
       { 
        super();
       } // end one-constructor
       
    public MyPod(int memory, String color)
       {
        super();
       } // end one-constructor
       
    public void connectobluetooth()
       {
        System.out.println( "Connecting to bluetooth for my pod" );   
       } // end method
       
    public String toString()
       {  
        return super.toString();
       } // end toString 
   } // end class 