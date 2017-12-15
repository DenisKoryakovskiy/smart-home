package ru.sbt.smartHome;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by user on 15.12.2017.
 */
public class SmartHomeSaver {
    static void saveSmartHome(SmartHome smartHome) throws IOException {
        String jsonString = SmartHomeTransformer.transform(smartHome);
        Path path = Paths.get("output.js");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {writer.write(jsonString);}
    }
}
