package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.OrArray;

import static org.junit.Assert.*;

public class OrArrayTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] {}, OrArray.or(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, OrArray.or(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1}, OrArray.or(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {1, 2}, OrArray.or(new int[] {1, 2}, new int[] {1, 2}));
        assertArrayEquals(new int[] {1, 2, 3}, OrArray.or(new int[] {1, 2}, new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {1, 2, 3}, OrArray.or(new int[] {1}, new int[] {2, 3}));
    }
}