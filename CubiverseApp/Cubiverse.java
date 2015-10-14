package CubiverseApp;

public class Cubiverse
    {
        private double ID;
        private double x, y, z;
        private int w, h, d;
        private int demensions;
        private double demensions2;
        private String name;
        
        public Cubiverse()
          {
            ID = ((double)(Math.random())); 
            name = new String("Name : Default Cubiverse - "); 
            x = 0.5;
            y = 0.5;
            z = 0.5;
            w = 1;
            h = 1;
            d = 1; 
            demensions = 1;
            demensions2 = 0.5;
              
          } // end constructor 
          
        public Cubiverse(int w, int h, int d, String name)
          {
           this.w = w;
           this.h = h;
           this.d = d;
           this.name = new String(name);
           
           
          } // another constructor 
          
        public String toString()
          {
           String output = new String();
           output =  name + ID + "\n" +
                    "w : " + w + "\n" +
                    "h : " + h + "\n" +
                    "d : " + d + "\n" +
                    "volume : " + demensions + "\n" +
                    "x : " + x + "\n" + 
                    "y : " + y + "\n" +
                    "z : " + z + "\n" +
                    "distance from left : " + demensions2 + "\n" +
                    "distance from bottom : " + demensions2 + "\n" +
                    "distance from back : " + demensions2 + "\n"; 
                    
           return output; 
          }
    }
    