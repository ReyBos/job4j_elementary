package test.java.ru.job4j.array;

import org.junit.Test;
import main.java.ru.job4j.array.Sorted;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortedTest {

    @Test
    public void whenSorted() {
        assertThat(
                Sorted.isSorted(
                        new int[] {1, 2, 3}
                ),
                is(true)
        );
    }

    @Test
    public void whenNotSorted() {
        assertThat(
                Sorted.isSorted(
                        new int[] {1, 3, 2}
                ),
                is(false)
        );
    }
}