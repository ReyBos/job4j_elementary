package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean rsl = Triangle.exist(2, 2, 2);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean rsl = Triangle.exist(5, 2, 2);
        assertThat(rsl, is(false));
    }
}