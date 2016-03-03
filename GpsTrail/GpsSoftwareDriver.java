package GpsTrail;
import java.util.ArrayList;

public class GpsSoftwareDriver
{
    public static void main (String[] arg)
    {
        int i= 0;
        GpsSoftware Trail1 = new GpsSoftware();
        System.out.print("Trail 1 \n \nindex Elevation \n" + Trail1 + "\n");
        System.out.println("Trail 1's total distance is " + Trail1.getLength() + " Meters");
        System.out.println("Trail 1 is difficult: " + Trail1.isDifficult(0, Trail1.markers.size()-1));
        System.out.println("Trail 1 from marker number 1 to 5 is difficult: " + Trail1.isDifficult(1, 5));
        System.out.println("Trail 1 is level: " + Trail1.isLevelTrailSegment(0, Trail1.markers.size()-1));
        System.out.println("Trail 1 from marker number 3 to 6 is level: " + Trail1.isLevelTrailSegment(3, 6)+ "\n");
        
        
        ArrayList<Integer> newmarkers = new ArrayList<Integer>();
        newmarkers.add(100);
        newmarkers.add(99);
        newmarkers.add(30);
        newmarkers.add(40);
        newmarkers.add(120);
        newmarkers.add(20);
        newmarkers.add(60);
        newmarkers.add(100);
        newmarkers.add(300);
        newmarkers.add(40);
        newmarkers.add(110);
        newmarkers.add(120);
        newmarkers.add(130);
        GpsSoftware Trail2 = new GpsSoftware(newmarkers);
        System.out.print("Trail 2 \n \nindex Elevation \n" + Trail2 + "\n");
        System.out.println("Trail 2's total distance is " + Trail2.getLength() + " Meters");
        System.out.println("Trail 2 is difficult: " + Trail2.isDifficult(0, newmarkers.size()-1));
        System.out.println("Trail 2 from marker number 1 to 4 is difficult: " + Trail2.isDifficult(1, 4));
        System.out.println("Trail 2 is level: " + Trail2.isLevelTrailSegment(0, newmarkers.size()-1));
        System.out.println("Trail 2 from marker number 3 to 9 is level: " + Trail2.isLevelTrailSegment(3, 9)+ "\n");
        
        
        ArrayList<Integer> newMarkers2 = new ArrayList<Integer>();
        newMarkers2.add(90);
        newMarkers2.add(84);
        newMarkers2.add(82);
        newMarkers2.add(75);
        newMarkers2.add(68);
        newMarkers2.add(65);
        newMarkers2.add(60);
        newMarkers2.add(70);
        newMarkers2.add(70);
        newMarkers2.add(78);
        newMarkers2.add(80);
        newMarkers2.add(85);
        newMarkers2.add(90);
        GpsSoftware Trail3 = new GpsSoftware(newMarkers2);
        System.out.print("Trail 3 \n \nindex Elevation \n" + Trail3 + "\n");
        System.out.println("Trail 3's total distance is " + Trail3.getLength() + " Meters");
        System.out.println("Trail 3 is difficult: " + Trail3.isDifficult( 0 , newMarkers2.size() - 1));
        System.out.println("Trail 3 from marker number 5 to 9 is difficult: " + Trail3.isDifficult(5 , 9));
        System.out.println("Trail 3 is level: " + Trail3.isLevelTrailSegment (0 , newMarkers2.size() - 1));
        System.out.println("Trail 3 from marker number 3 to 8 is level: " + Trail3.isLevelTrailSegment( 3, 8) + "\n");
        
    }
}
