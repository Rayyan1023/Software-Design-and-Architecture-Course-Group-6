import org.json.JSONObject;
import org.json.JSONString;
import org.json.JSONTokener;

import java.io.InputStream;

public class JSON {
    private String index;
    private double result;
    private String path = "/data.json";

    public JSON(String index) {
        this.index = index;
        findJSON();
    }

    public void findJSON(){
        InputStream inputStream = JSON.class.getResourceAsStream(path);
        if (inputStream == null) {
            throw new NullPointerException("Cannot find resource file " + path);
        }
        JSONTokener tokener = new JSONTokener(inputStream);
        JSONObject object = new JSONObject(tokener);
        object = object.getJSONObject(index);
        result = object.getDouble("price");

    }

    public double getJson(){
        return this.result;
    }

}
