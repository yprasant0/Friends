import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;
import java.util.*;

public class GetData {
  public static List<List<String>> readData(String filename){
    List<List<String>> data =  new ArrayList<List<String>>();

    List <String> latitude = new ArrayList<>();
    List <String> longitude = new ArrayList<>();
    List <String> name = new ArrayList<>();
    List <String> user_id = new ArrayList<>();

    JSONParser parser = new JSONParser();

    try{

        FileReader f = new FileReader(filename);
        JSONArray a = (JSONArray) parser.parse(f);

        for (Object o : a){
            JSONObject person = (JSONObject) o;

            String Name = (String)person.get("name");

            String Latitude = (String)person.get("latitude");

            String User_id = Long.toString((Long)(person.get("user_id")));

            String Longitude = (String)person.get("longitude");

            latitude.add(Latitude);
            name.add(Name);
            user_id.add(User_id);
            longitude.add(Longitude);
        }
        data.add(latitude);
        data.add(name);
        data.add(user_id);
        data.add(longitude);
    }

    catch (FileNotFoundException e){
        System.out.println("file not found");
    }

    catch(IOException e){
        System.out.println("IOException");
    }
    catch(NumberFormatException e){
        System.out.println("The inpuut is wrong");
    }
    catch(ParseException e){
        System.out.println("The ParseException Error");
    }
    return data;

  }
}






