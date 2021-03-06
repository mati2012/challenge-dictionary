package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static List<String> readFile() {

        BufferedReader reader;
        try {
            String DIC_FILE_LOCATION = "C:\\WORKSPACE\\challenge-dictionary\\src\\main\\resources\\dictionary.txt";
            File file = new File(DIC_FILE_LOCATION);
            reader = new BufferedReader(new FileReader(file));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String line;
        List<String> data = new ArrayList<>();


        try {
            while (((line = reader.readLine()) != null)) {
                data.add(line);
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


