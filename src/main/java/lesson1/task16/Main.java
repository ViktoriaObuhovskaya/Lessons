//Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать


package main.java.lesson1.task16;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }
        for (int i = 0; i < (marks.length / 2); i++) {
            int temp = marks[marks.length - i - 1];
            marks[marks.length - i - 1] = marks[i];
            marks[i] = temp;
        }
        System.out.print("\n");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}



