package main;

import classes.Dictionary;
import utils.WordMatcher;

import java.io.IOException;
import java.util.List;

public class Exercise {
    public static void main(String[] args) throws IOException {
        String word = "working";
        Dictionary dic = new Dictionary();
        WordMatcher mixer = new WordMatcher();

        List<String> words = mixer.getWordMatches(word);

        System.out.println("Words found in " + word + ":");
        words.forEach(mix -> {
            if (dic.isEnglishWord(mix)) {
                System.out.println(mix.toUpperCase());
            }
        });


    }
}
