import java.util.*;
import java.io.*;
public class Valuesin100KM {

    public static List<List<String>> getvalues(List<List<String>> data){

        List<List<String>> val = new ArrayList<List<String>>();
        List longitude = new ArrayList<String>();
        List latitude = new ArrayList<String>();
        List name = new ArrayList<String>();
        List userid = new ArrayList<String>();

        List DesiredName = new ArrayList<String>();
        List DesiredUserid = new ArrayList<String>();
        // getting lati,longi,name,userid
        latitude = data.get(0);
        name = data.get(1);
        userid = data.get(2);
        longitude = data.get(3);

        for(int i=0;i<longitude.size();i++) {
            String str1 = (String)latitude.get(i);
            String str2 = (String) longitude.get(i);

            // segreagating the distances
            Double dist = DistanceCalculation.distance(str1, str2);
            System.out.print(dist+" ");
            if (dist <= 100) {
                DesiredName.add(name.get(i));
                DesiredUserid.add(userid.get(i));

            }
        }   // storing the name and userid in list of list
            val.add(DesiredName);
            val.add(DesiredUserid);

            return val;



    }
}

