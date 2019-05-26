import java.util.*;

public class SortedID {

    public static List<List<String>> sorting(List<List<String>> data){

        List<List<String>> NameUserId = new ArrayList<List<String>>();

        String [] name = data.get(0).toArray(new String[data.get(0).size()]);
        String [] userid = (data.get(1).toArray(new String[data.get(1).size()]));
        // Bubble sort
        for(int i=0;i<userid.length-1;i++){
            for(int k=0;k<userid.length-i-1;k++){

                if((Integer.valueOf(userid[k]))>(Integer.valueOf(userid[k+1]))){
                    //swaping id
                    String temp1 = userid[k];
                    userid[k]=userid[k+1];
                    userid[k+1]=temp1;
                    // swaping coresponding name
                    String temp2 = name[k];
                    name[k] = name[k+1];
                    name[k+1] = temp2;

                }
            }
        }
        // Adding them to the ArrayList of names and userid to be passed
        List <String> id = Arrays.asList(userid);
        List <String> n = Arrays.asList(name);

        NameUserId.add(id);
        NameUserId.add(n);
        return NameUserId;
    }

}
