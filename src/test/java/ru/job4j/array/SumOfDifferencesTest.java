package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.SumOfDifferences;

import static org.junit.Assert.*;

public class SumOfDifferencesTest {
    @Test
    public void test() {
        Assert.assertEquals(9, SumOfDifferences.sum(new int[] {10, 2, 1}));
        assertEquals(2, SumOfDifferences.sum(new int[] {3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[] {5, 4, 3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[] {5, 3, 1}));
    }
}