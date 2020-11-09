package test.java.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.loop.MultiplicationLoop;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {
    @Test
    public void test() {
        Assert.assertEquals(0, MultiplicationLoop.mult(0, 2));
        assertEquals(2, MultiplicationLoop.mult(1, 2));
        assertEquals(6, MultiplicationLoop.mult(1, 3));
    }
}