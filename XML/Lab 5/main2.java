import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class main2 {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("ex2.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            JSONObject widget = (JSONObject) jsonObject.get("widget");
            String debug = (String) widget.get("debug");
            System.out.println(debug);
            JSONObject window = (JSONObject) widget.get("window");
            parseWindow(window);
            JSONObject image = (JSONObject) widget.get("image");
            parseImage(image);
            JSONObject text = (JSONObject) widget.get("text");
            parseText(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseWindow(JSONObject obj){
        String title = (String)obj.get("title");
        System.out.println(title);
        String name = (String)obj.get("name");
        System.out.println(name);
        Long width = (Long) obj.get("width");
        System.out.println(width);
        Long height = (Long) obj.get("height");
        System.out.println(height);
    }
    private static void parseImage(JSONObject obj){
        String src = (String)obj.get("src");
        System.out.println(src);
        String name = (String)obj.get("name");
        System.out.println(name);
        Long hOffset = (Long) obj.get("hOffset");
        System.out.println(hOffset);
        Long vOffset = (Long) obj.get("vOffset");
        System.out.println(vOffset);
        String alignment = (String)obj.get("alignment");
        System.out.println(alignment);
    }
    private static void parseText(JSONObject obj){
        String data = (String)obj.get("data");
        System.out.println(data);
        Long size = (Long) obj.get("size");
        System.out.println(size);
        String style = (String)obj.get("style");
        System.out.println(style);
        String name = (String)obj.get("name");
        System.out.println(name);
        Long hOffset = (Long) obj.get("hOffset");
        System.out.println(hOffset);
        Long vOffset = (Long)obj.get("vOffset");
        System.out.println(vOffset);
        String alignment = (String)obj.get("alignment");
        System.out.println(alignment);
        String onMouse = (String)obj.get("onMouseUp");
        System.out.println(onMouse);
    }
}
