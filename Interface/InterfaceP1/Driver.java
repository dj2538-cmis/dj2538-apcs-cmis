package Interface.InterfaceP1;
import java.util.ArrayList; 

public class Driver
   {
    public static void main (String[] args)
       {
        MyPod pod = new MyPod(32, "Black");
        MyPhone phone = new MyPhone(16, "Blue", "AT&T");
        MyCar car = new MyCar(38);
        
        ArrayList<Connectable> inventory = new ArrayList<Connectable>();
        inventory.add(pod);
        inventory.add(phone);
        inventory.add(car);
        
        for(Connectable device: inventory)
        {
            System.out.println(device + "\n");
        }
        
        for(Connectable device: inventory)
        {
            device.connectobluetooth();
        }
        
        System.out.println("\n" + car.discountable());
    }
       } // end void main

