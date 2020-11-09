package main.java.ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0, i = 0;
        while (data[i] != el) {
            sum += data[i];
            i++;
        }
        return sum % 2 == 0 ? sum : 0;
    }
}
