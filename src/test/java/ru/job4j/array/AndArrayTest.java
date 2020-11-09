package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.AndArray;

import static org.junit.Assert.*;

public class AndArrayTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[] {}, AndArray.and(new int[] {1, 2, 3}, new int[] {4, 5}));
        assertArrayEquals(new int[] {1}, AndArray.and(new int[] {1, 2, 3}, new int[] {1, 4, 5}));
        assertArrayEquals(new int[] {4, 5}, AndArray.and(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5}));
    }
}