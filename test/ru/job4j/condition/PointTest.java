package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when98to64Then5() {
        int x1 = 9;
        int y1 = 8;
        int x2 = 6;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to22then2() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }
}