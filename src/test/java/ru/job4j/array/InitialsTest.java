package test.java.ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import main.java.ru.job4j.array.Initials;

import static org.junit.Assert.*;

public class InitialsTest {
    @Test
    public void test() {
        Assert.assertEquals("Иванов И.И.", Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
        assertEquals("Григорьев И.Н.", Initials.convert(new String[] {"Григорьев", "Игорь", "Николаевич"}));
    }
}