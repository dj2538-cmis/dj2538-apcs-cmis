package Interface.InterfaceP1;

public class MyCar extends Vehicle
   {
    private int kpl;
    private double draw;
    
    public MyCar(int kilosperliter)
       { 
        this.kpl = kilosperliter;
       } // end one-constructor
       
    public MyCar(int passengers, int kilosperliter)
       {
        super(passengers);
        this.kpl = kilosperliter; 
       } // end one-constructor
       
    public void connectobluetooth()
       {
        System.out.println( "Connecting to bluetooth for my car" );   
       } // end method
       
    public String discountable()
       {
        draw = Math.random();
        if( draw > 0.5)
           {
            return "You get a discount!";
           }
        else
           {
            return "full price";
           }
       }
       
    public String toString()
       {  
        return super.toString() + "\n" +
               "Kilos per liter for this car is: " + kpl; 
       } // end toString 
      
      
    } // end class 