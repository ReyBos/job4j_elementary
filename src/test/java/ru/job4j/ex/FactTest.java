package test.java.ru.job4j.ex;

import org.junit.Test;
import main.java.ru.job4j.ex.Fact;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNumberNegativeThenFinish() {
        Fact.calc(-12);
    }
}