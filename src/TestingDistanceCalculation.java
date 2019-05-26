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

public class TestingDistanceCalculation {



    @Test
    public void testdistance1()
    {
        assertEquals("Error in distance",(Long)64L,DistanceCalculation.distance("12.986375","77.043701"));
    }


    @Test
    public void testdistance2()
    {
        assertEquals("Error in distance",(Long)8662L,DistanceCalculation.distance("0","0"));
    }


    @Test
    public void testdistance3()
    {
        assertEquals("Error in distance",(Long)0L,DistanceCalculation.distance("12.96611159","77.6362214"));
    }


    @Test
    public void testdistance4()
    {
        assertEquals("Error in distance",(Long)147L,DistanceCalculation.distance("11.8856167","78.4240911"));
    }


    @Test
    public void testdistance5()
    {
        assertEquals("Error in distance",(Long)127L,DistanceCalculation.distance("14.080556","77.361944"));
    }


    @Test
    public void testdistance6()
    {
        assertEquals("Error in distance",(Long)4710L,DistanceCalculation.distance("34.0522","118.2437"));
    }


    @Test
    public void testdistance7()
    {
        assertEquals("Error in distance",(Long)11442L,DistanceCalculation.distance("-90.00","0.00"));
    }

    @Test
    public void testdistance8()
    {
        assertEquals("Error in distance",(Long)8560L,DistanceCalculation.distance("90.00","0.00"));
    }


    @Test       //Test Case having negative coordinates
    public void testdistance9()
    {
        assertEquals("Error in distance",(Long)17163L,DistanceCalculation.distance("-34.0522","-118.2437"));
    }


}
