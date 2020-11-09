package test.java.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.array.UpperCase;

public class UpperCaseTest {
    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        Assert.assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }
}