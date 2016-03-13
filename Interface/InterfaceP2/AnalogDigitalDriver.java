package Interface.InterfaceP2;
import java.util.ArrayList; 

public class AnalogDigitalDriver
   {
    public static void main (String[] args)
       {
        BWTV bwTV = new BWTV();
        HDTV hdTV = new HDTV();
        
        ArrayList<TV> inventory = new ArrayList<TV>();
        inventory.add(bwTV);
        inventory.add(hdTV);
        
        for(TV tv : inventory)
        {
            System.out.println( tv.tvType() + "ON ? " + tv.getTV() );
        } // end for-each loop
        
        for( int i = 0; i < inventory.size(); i++ )
           {
            inventory.get(i).setTVOn(true);
           } // end for 
          
        System.out.println("\n");  
           
        for(TV tv : inventory)
           {
            System.out.println( tv.tvType() + "ON ? " + tv.getTV() );
           } // end for-each loop
        
       
        System.out.println("\n" + bwTV.rotateRabbitEars());
        System.out.println(hdTV.connectHDMI());
        
    }
       } // end void main

