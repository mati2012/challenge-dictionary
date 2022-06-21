package exercise;

import org.junit.Test;
import utils.WordMatcher;

import java.util.List;

public class WordMatcherTest {

    @Test
    public void amountOfMatchesFor3CharWord() {
        String word = "row";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 2);
    }

    @Test
    public void returnEmptyIfEmptyString() {
        String word = "";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }

    @Test
    public void returnEmptyIfNoMatches() {
        String word = "E$T";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }


}
