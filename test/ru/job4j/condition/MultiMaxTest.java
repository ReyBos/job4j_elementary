package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(2, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(2, 3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenEquals() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}