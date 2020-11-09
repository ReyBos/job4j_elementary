package test.java.ru.job4j.array;

import org.junit.Test;
import main.java.ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoElementsEqual() {
        int[] input = new int[] {3, 1, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoElementsEqualInTheEnd() {
        int[] input = new int[] {3, 4, 1, 5, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4, 5, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoElementsEqualInTheStart() {
        int[] input = new int[] {3, 3, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 3, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenThreeElements() {
        int[] input = new int[] {3, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 5};
        assertThat(result, is(expect));
    }
}