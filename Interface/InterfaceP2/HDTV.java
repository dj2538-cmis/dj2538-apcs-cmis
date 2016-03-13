package Interface.InterfaceP2;

public class HDTV extends TV implements Digital
   {
    public HDTV()
       {
        super();   
       } // end supering
       
    public String connectHDMI()
      {
       return "HDMI cable connected"; 
      } // rabbit earing
      
    public String tvType()
     {
      return "I'm a High Def 24 million color TV";   
     } // TV Typing
       
   } // end class
