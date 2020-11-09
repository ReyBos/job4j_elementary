package test.java.ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.calculator.Fit;

public class FitTest {
    @Test
    public void whenMan200Then115() {
        short in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}