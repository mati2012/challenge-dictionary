package exercise;

import classes.Dictionary;
import org.junit.Test;

public class DictionaryTest {

    @Test
    public void searchForEnglishWord(){
        Dictionary dic = new Dictionary();
        assert dic.isEnglishWord("WORK");
    }

    @Test
    public void incorrectEnglishWord(){
        Dictionary dic = new Dictionary();
        assert !dic.isEnglishWord("ESTUDIO");
    }

    @Test
    public void emptyString(){
        Dictionary dic = new Dictionary();
        assert !dic.isEnglishWord("");
    }
    @Test
    public void nullString(){
        Dictionary dic = new Dictionary();
        assert !dic.isEnglishWord(null);
    }

}
