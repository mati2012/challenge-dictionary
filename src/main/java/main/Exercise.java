package main;

import classes.Dictionary;
import utils.WordMatcher;

import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        String word = "working";
        Dictionary dic = new Dictionary();
        WordMatcher matcher = new WordMatcher();

        List<String> wordMatches = matcher.getWordMatches(word);

        System.out.println("Words found in " + word + ":");
        wordMatches.forEach(mix -> {
            if (dic.isEnglishWord(mix)) {
                System.out.println(mix.toUpperCase());
            }
        });


    }
}
