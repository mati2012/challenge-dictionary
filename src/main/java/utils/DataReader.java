package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static List<String> readFile() throws IOException {

        BufferedReader reader;
        try {
            String DIC_FILE_LOCATION = "C:\\WORKSPACE\\Java\\ChallengePublicis\\src\\main\\resources\\dictionary.txt";
            File file = new File(DIC_FILE_LOCATION);
            reader = new BufferedReader(new FileReader(file));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String line;
        List<String> data = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            data.add(line);
        }

        return data;
    }

}
