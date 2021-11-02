//Найти максимальное значение


package main.java.lesson1.task11;

public class Main {
    public static void main(String[] args) {
        int[] marks = {1, 5, 3};
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
