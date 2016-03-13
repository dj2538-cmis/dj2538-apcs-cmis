package Inheritance.Inheritance3;

public abstract class SuperHero
   {
    private String suitColor;
    private boolean hasCape;
    private String Name;

    public SuperHero()
       {
        this.suitColor = new String();
        this.hasCape = false;
        this.Name = new String();
       } // end zero-arg constructor SuperHero

    public void setSuitColor(String suitColor)
       {
        this.suitColor = new String( suitColor );
       } // end method setSuitColor
      
    public String getSuitColor()
       {
        return suitColor;	
       } // end method getSuitColor
   
    public void setCape(boolean cape)
       {
        this.hasCape = cape;	
       } // end method setCape
      
    public boolean isCaped()
       {
        return hasCape;	
       } // end method isCaped
       
    public void setName(String Name)
       {
        this.Name = new String( Name);   
       } // setName
       
    public String getName()
       {
        return Name;   
       } // get name 
      
    public abstract String motto();   
    
    public String toString()
       {
        String output = new String();   
        output = getName() + "\t" + hasCape + "\t" + getSuitColor() + "\t" + motto();
        return output;
       } // end toString

   } // end abstract class SuperHero

