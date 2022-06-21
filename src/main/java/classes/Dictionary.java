package classes;

import java.util.List;

import static utils.DataReader.readFile;

public class Dictionary {
    private final List<String> words;

    public Dictionary() {
        words = readFile();
    }

    public boolean isEnglishWord(String word) {
        if (word != null) {
            return words.stream().anyMatch(word::equalsIgnoreCase);
        } else return false;
    }
}
