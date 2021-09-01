// Определите сумму элементов массива, расположенных между минимальным и максимальным значениями


package main.java.lesson1.task15;

public class Main {
    public static void main(String[] args) {
        int[] marks = {27, 1, 9, 4, 3, 8, 5, 35};
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[maxIndex] < marks[i])
                maxIndex = i;

        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[minIndex] > marks[i])
                minIndex = i;

        }
        if (maxIndex > minIndex)
            for (int i = minIndex + 1; i < maxIndex; i++)
                sum += marks[i];
        else
            for (int i = maxIndex + 1; i < minIndex; i++)
                sum += marks[i];

        System.out.println("The sum of the array elements located between the minimum and maximum values " + sum);
    }
}

