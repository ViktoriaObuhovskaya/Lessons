// Вывести максимальную оценку и ее номер


package main.java.lesson1.task14;

public class Main {
    public static void main(String[] args) {
        int[] marks = {1, 3, 9, 5, 6};
        int maxMarks = marks[0];
        for (int i = 0; i < 5; i++) {
            if (maxMarks < marks[i])
                maxMarks = marks[i];
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n" + "Maximum value " + maxMarks);
        for (int j = 0; j < marks.length; j++) {
            if (marks[j] == maxMarks)
                System.out.println("Maximum value index " + j);
        }
    }
}


