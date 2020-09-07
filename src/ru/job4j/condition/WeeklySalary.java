package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            int increasedRate = hours[i] > 8 ? hours[i] % 8 : 0;
            int standardRate = hours[i] - increasedRate;
            int salary = standardRate * 10 + increasedRate * 15;
            result += i > 4 ? salary * 2 : salary;
        }
        return result;
    }
}
