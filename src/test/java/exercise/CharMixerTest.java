package exercise;

import org.junit.Test;
import utils.CharMixer;

import java.io.IOException;
import java.util.List;

public class CharMixerTest {

    @Test
    public void amountOfMatchesFor3CharWord() throws IOException {
        String word = "row";
        CharMixer mixer = new CharMixer();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 2);
    }

    @Test
    public void returnEmptyIfEmptyString() throws IOException {
        String word = "";
        CharMixer mixer = new CharMixer();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }

    @Test
    public void returnEmptyIfNoMatches() throws IOException {
        String word = "E$T";
        CharMixer mixer = new CharMixer();
        List<String> matches = mixer.getWordMatches(word);
        assert (matches.size() == 0);
    }


}
