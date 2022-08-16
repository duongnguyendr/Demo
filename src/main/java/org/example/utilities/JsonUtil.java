package org.example.utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonUtil {

    public String getJsonFromKey(String path, String key) {
        JSONParser parser = new JSONParser();
        String value;

        try {
            Object obj = parser.parse(new FileReader(path));

            JSONObject jsonObject = (JSONObject) obj;
            return value = (String) jsonObject.get(key);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }

    }
}
