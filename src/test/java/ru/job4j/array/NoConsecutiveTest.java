package test.java.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.array.NoConsecutive;

import static org.junit.Assert.*;

public class NoConsecutiveTest {
    @Test
    public void test() {
        Assert.assertEquals(-1, NoConsecutive.find(new int[] {1, 2, 3}));
        assertEquals(-1, NoConsecutive.find(new int[] {}));
        assertEquals(3, NoConsecutive.find(new int[] {1, 3}));
        assertEquals(3, NoConsecutive.find(new int[] {1, 3, 4, 5}));
        assertEquals(-1, NoConsecutive.find(new int[] {1, 2, 3, 4, 5}));
    }
}