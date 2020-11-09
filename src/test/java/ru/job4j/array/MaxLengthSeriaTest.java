package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.MaxLengthSeria;

import static org.junit.Assert.*;

public class MaxLengthSeriaTest {
    @Test
    public void test() {
        Assert.assertEquals(1, MaxLengthSeria.find(new int[] {1}));
        assertEquals(1, MaxLengthSeria.find(new int[] {2, 1}));
        assertEquals(2, MaxLengthSeria.find(new int[] {1, 2}));
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxLengthSeria.find(new int[] {3, 2, 1}));
    }
}