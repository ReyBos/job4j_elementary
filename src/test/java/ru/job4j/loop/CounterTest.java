package test.java.ru.job4j.loop;

import org.junit.Test;
import main.java.ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyThenNinety() {
        int rsl = Counter.sumByEven(10, 20);
        int expected = 90;
        assertThat(rsl, is(expected));
    }
}