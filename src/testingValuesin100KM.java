import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
import java.util.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;
public class testingValuesin100KM {
    public static void testingValues(){

        List<List<String> > dataOutput = new ArrayList<List<String>>();
        List<String> innerOutput1 = new ArrayList<String>();
        List<String> innerOutput2 = new ArrayList<String>();

        innerOutput1.add("Chris");
        innerOutput2.add("12");

        dataOutput.add(innerOutput1);
        dataOutput.add(innerOutput2);

        //Input Data

        List<List<String> > data = new ArrayList<List<String>>();
        List<String> innerList1 = new ArrayList<String>();
        List<String> innerList2 = new ArrayList<String>();
        List<String> innerList3 = new ArrayList<String>();
        List<String> innerList4 = new ArrayList<String>();

        innerList1.add("12.986375");
        innerList1.add("13.761389");
        innerList1.add("14.133333");
        innerList1.add("13.74412");

        data.add(innerList1);

        innerList2.add("Chris");
        innerList2.add("Nick");
        innerList2.add("Rose");
        innerList2.add("Oliver");

        data.add(innerList2);

        innerList3.add("12");
        innerList3.add("30");
        innerList3.add("24");
        innerList3.add("29");

        data.add(innerList3);

        innerList4.add("77.043701");
        innerList4.add("76.2875");
        innerList4.add("77.433333");
        innerList4.add("76.11167");

        data.add(innerList4);

        assertEquals("Error in GetValues",dataOutput,Valuesin100KM.getvalues(data));
    }





}
