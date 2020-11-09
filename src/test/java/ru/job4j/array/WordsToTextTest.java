package test.java.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.array.WordsToText;

import static org.junit.Assert.*;

public class WordsToTextTest {
    @Test
    public void test() {
        Assert.assertEquals("Hello World", WordsToText.convert(new String[] {"Hello", "World"}));
        assertEquals("one two three", WordsToText.convert(new String[] {"one", "two", "three"}));
        assertEquals("one", WordsToText.convert(new String[] {"one"}));
    }
}