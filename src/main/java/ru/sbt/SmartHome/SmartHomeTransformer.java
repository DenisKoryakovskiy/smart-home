package ru.sbt.smartHome;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by user on 15.12.2017.
 */
public class SmartHomeTransformer {
    public static String transform(SmartHome smartHome) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(smartHome);
        System.out.println(jsonString);
        return jsonString;
    }
}
