package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenTwoArguments() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenThreeArguments() {
        int result = Max.max(3, 2, 0);
        assertThat(result, is(3));
    }

    @Test
    public void whenFourArguments() {
        int result = Max.max(5, 5, 8, 10);
        assertThat(result, is(10));
    }
}