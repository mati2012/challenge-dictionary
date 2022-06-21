package exercise;

import org.junit.Test;
import utils.WordMatcher;

import java.io.IOException;
import java.util.List;

public class WordMatcherTest {

    @Test
    public void amountOfMatchesFor3CharWord() throws IOException {
        String word = "row";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 2);
    }

    @Test
    public void returnEmptyIfEmptyString() throws IOException {
        String word = "";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }

    @Test
    public void returnEmptyIfNoMatches() throws IOException {
        String word = "E$T";
        WordMatcher mixer = new WordMatcher();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }


}
