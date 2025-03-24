public class EarthVolumeCalculator { 
    public static double volumeOfEarth(double radiusOfEarth) { 
        return (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarth, 3); 
    } 
    public static void main(String[] args) { 
        double radiusOfEarthInKm = 6378; 
        double radiusOfEarthInMiles = radiusOfEarthInKm * 0.6213711922; 
        double volumeOfEarthInKm = volumeOfEarth(radiusOfEarthInKm); 
        double volumeOfEarthInMiles = volumeOfEarth(radiusOfEarthInMiles); 
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles); 
    } 
} 
