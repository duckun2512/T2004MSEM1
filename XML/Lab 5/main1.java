import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class main1 {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("ex1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            JSONObject menu = (JSONObject) jsonObject.get("menu");
            String header = (String) menu.get("header");
            System.out.println(header);
            JSONArray item = (JSONArray) menu.get("item");
            item.forEach(items -> parseMenu((JSONObject) items));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseMenu(JSONObject items){

        if(items==null){
            System.out.println("null");
        }else {
            String title = (String)items.get("id");
            System.out.println(title);
        }
    }
}
