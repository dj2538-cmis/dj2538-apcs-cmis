package GpsTrail;
import java.util.ArrayList;

public class GpsSoftwareDriver
{
    public static void main (String[] arg)
    {
        int i= 0;
        GpsSoftware TrailA = new GpsSoftware();
        System.out.print("TrailA\nindex Elevation \n" + TrailA);
        System.out.println("TrailA's total distance is " + TrailA.getLength() + " Meters");
        System.out.println("TrailA is difficult: " + TrailA.isDifficult(0, TrailA.markers.size()-1));
        System.out.println("TrailA from marker number 3 to 5 is difficult: " + TrailA.isDifficult(3, 5));
        System.out.println("TrailA is level: " + TrailA.isLevelTrailSegment(0, TrailA.markers.size()-1));
        System.out.println("TrailA from marker number 2 to 4 is level: " + TrailA.isLevelTrailSegment(2, 4)+ "\n");
        
        
        ArrayList<Integer> newmarkers = new ArrayList<Integer>();
        newmarkers.add(30);
        newmarkers.add(97);
        newmarkers.add(92);
        newmarkers.add(96);
        newmarkers.add(90);
        newmarkers.add(90);
        newmarkers.add(91);
        newmarkers.add(44);
        newmarkers.add(93);
        newmarkers.add(95);
        newmarkers.add(91);
        newmarkers.add(24);
        newmarkers.add(47);
        GpsSoftware TrailB = new GpsSoftware(newmarkers);
        System.out.print("TrailB\nindex Elevation \n" + TrailB);
        System.out.println("TrailB's total distance is " + TrailB.getLength() + " Meters");
        System.out.println("TrailB is difficult: " + TrailB.isDifficult(0, newmarkers.size()-1));
        System.out.println("TrailB from marker number 2 to 7 is difficult: " + TrailB.isDifficult(2, 7));
        System.out.println("TrailB is level: " + TrailB.isLevelTrailSegment(0, newmarkers.size()-1));
        System.out.println("TrailB from marker number 4 to 9 is level: " + TrailB.isLevelTrailSegment(4, 9)+ "\n");
        
        
        ArrayList<Integer> newMarkers2 = new ArrayList<Integer>();
        newMarkers2.add(99);
        newMarkers2.add(96);
        newMarkers2.add(89);
        newMarkers2.add(99);
        newMarkers2.add(56);
        newMarkers2.add(63);
        newMarkers2.add(20);
        newMarkers2.add(10);
        newMarkers2.add(10);
        newMarkers2.add(20);
        newMarkers2.add(63);
        newMarkers2.add(56);
        newMarkers2.add(99);
        GpsSoftware TrailC = new GpsSoftware(newMarkers2);
        System.out.print("TrailC\nindex Elevation \n" + TrailC);
        System.out.println("TrailC's total distance is " + TrailC.getLength() + " Meters");
        System.out.println("TrailC is difficult: " + TrailC.isDifficult( 0 , newMarkers2.size() - 1));
        System.out.println("TrailC from marker number 7 to 9 is difficult: " + TrailC.isDifficult(7 , 9));
        System.out.println("TrailC is level: " + TrailC.isLevelTrailSegment (0 , newMarkers2.size() - 1));
        System.out.println("TrailC from marker number 2 to 8 is level: " + TrailC.isLevelTrailSegment( 2, 8) + "\n");
        
    }
}
