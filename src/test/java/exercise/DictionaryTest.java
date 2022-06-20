package exercise;

import classes.Dictionary;
import org.junit.Test;

import java.io.IOException;

public class DictionaryTest {

    @Test
    public void searchForEnglishWord() throws IOException {
        Dictionary dic = new Dictionary();
        assert dic.isEnglishWord("WORK");
    }

    @Test
    public void incorrectEnglishWord() throws IOException {
        Dictionary dic = new Dictionary();
        assert !dic.isEnglishWord("ESTUDIO");
    }

    @Test
    public void emptyString() throws IOException {
        Dictionary dic = new Dictionary();
        assert !dic.isEnglishWord("");
    }

}
