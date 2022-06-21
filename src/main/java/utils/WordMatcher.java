package utils;

import java.io.IOException;
import java.util.List;

import static utils.DataReader.readFile;

public class WordMatcher {
    private final List<String> words;

    public WordMatcher() throws IOException {
        this.words = readFile();
    }

    public List<String> getWordMatches(String word) {
        return words.stream().filter(dicWord -> compareWordsByChar(word, dicWord)).toList();
    }

    private boolean compareWordsByChar(String word, String dicWord) {
        if (!word.equals("")) {
            int i = 0;
            boolean flag = false;
            char[] wordChars = word.toLowerCase().toCharArray();
            char[] dicWordChars = dicWord.toLowerCase().toCharArray();
            do {
                for (int j = 0; j < wordChars.length; j = j + 1) {

                    if (dicWordChars[i] == wordChars[j]) {
                        wordChars[j] = '*';
                        flag = true;
                        break;

                    } else {
                        flag = false;
                    }
                }
                i++;

            } while (flag && i < dicWordChars.length);

            return flag;
        } else {
            return false;
        }
    }
}

