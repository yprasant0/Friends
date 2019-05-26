import java.io.*;
import java.util.*;
public class DistanceCalculation {

    static int EarthRadius = 6378;
    static double SourceLatitude = 12.9611159;
    static double SourceLongitude = 77.6362214;

    public static Double distance(String DestinationLatitude,String DestinationLongitude){

        double LatiDes = Double.parseDouble (DestinationLatitude);
        double LongiDes = Double.parseDouble(DestinationLongitude);
        
        double phi_1 = Math.toRadians(SourceLatitude);
        double phi_2 = Math.toRadians(LatiDes);
        // distance calculation
        double delta_lambda =Math.abs( Math.toRadians(LongiDes - DistanceCalculation.SourceLongitude));
        double delta_sigma = Math.acos(((Math.sin(phi_1)*Math.sin(phi_2))+(Math.cos(phi_1)*Math.cos(phi_2)*Math.cos(delta_lambda))));

        Double d=  (DistanceCalculation.EarthRadius*delta_sigma);
        return d;
    }
}
