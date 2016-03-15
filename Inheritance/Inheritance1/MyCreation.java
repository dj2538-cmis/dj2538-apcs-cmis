package Inheritance.Inheritance1;

public class MyCreation extends MyDevice
   {
    private int cloud; // cloud storage
    private int corespeed;
    
    MyCreation()
       {
        super();
        this.cloud = 100;
       } // end zero-args constructor 
       
    MyCreation( String color, double memory, int size, int cloud )
       {
        super(color, memory, size);
        this.cloud = cloud;
        this.corespeed = corespeed;
       } // end three args constructor
    
    public int getcorespeed()
       {
        return corespeed; 
       } // end getRam
       
       
    public void setcorespeed( int corespeed )
       {
        this.corespeed = corespeed;       
        } // end setRam
       
    public String toString()
       {
        String output = new String();
        output = "My Creation " + "\n" +super.toString() + "\n" + 
                 "Cloud storage: " + cloud + " GB" + "\n" +
                 "Core Speed is : " + getcorespeed() + " KPH";
                 
        return output; 
       } // end toString
    
       
   } // end class