package classes;

import java.io.IOException;
import java.util.List;

import static utils.DataReader.readFile;

public class Dictionary {
    private final List<String> words;

    public Dictionary() throws IOException {
        words = readFile();
    }

    public boolean isEnglishWord(String word) {
        return words.stream().anyMatch(word::equalsIgnoreCase);
    }
}
