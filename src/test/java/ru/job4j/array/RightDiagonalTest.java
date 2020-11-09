package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.RightDiagonal;

public class RightDiagonalTest {
    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        Assert.assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }
}