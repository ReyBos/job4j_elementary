package test.java.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.array.DiffArray;

import static org.junit.Assert.*;

public class DiffArrayTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] {}, DiffArray.diff(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, DiffArray.diff(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {}, DiffArray.diff(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {1}, DiffArray.diff(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1, 3}, DiffArray.diff(new int[] {1, 2, 3}, new int[] {2}));
        assertArrayEquals(new int[] {1, 3}, DiffArray.diff(new int[] {1, 3}, new int[] {2}));
    }
}