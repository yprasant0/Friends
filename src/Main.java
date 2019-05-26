import java.util.*;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String [] args){
    List <List<String> > JsonData = new ArrayList<List<String>>();
    List <List<String> > Friendsin100KM = new ArrayList<List<String>>();
    JsonData = GetData.readData("/home/prasant/Desktop/file/friends.json");
    if (!JsonData.isEmpty()){
        Friendsin100KM = Valuesin100KM.getvalues(JsonData);
        System.out.println(SortedID.sorting(Friendsin100KM));
    }
}
}

