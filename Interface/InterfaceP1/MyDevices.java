package Interface.InterfaceP1;

public abstract class MyDevices implements Connectable
   {
    private int memory;
    private String color;
    
    public MyDevices()
       {
        this.memory = 8; //GB
        this.color = new String ("Black");
       } // end zero-constructor
       
    public MyDevices( int memory, String color ) 
       {
        this.memory = memory;
        this.color = color; 
       } // end one-constructor
       
    public abstract void connectobluetooth(); 
       
    public String toString()
       {
        String output = new String();
        output = "Device's memory: " + memory + "\n" +
                 "Device's color: " + color; 
        return output;
       } // end toString 
       
    } // end class
