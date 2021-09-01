//Создать двухмерный квадратный массив и заполнить его "бабочкой"


package main.java.lesson1.task17;

public class Main {
    public static void main(String[] args) {
        int[][] marks = new int[20][20];
        for (int i = 0; i < marks.length / 2; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if ((j < i) || (j >= marks[i].length - i))
                    marks[i][j] = 0;
                else marks[i][j] = 1;
            }
        }
        for (int i = marks.length - 1; i >= marks.length / 2; i--) {
            for (int j = 0; j < marks[i].length; j++) {
                if ((j > i) || (j < marks[i].length - i - 1))
                    marks[i][j] = 0;
                else marks[i][j] = 1;
            }
        }
        for (int[] mark : marks) {
            for (int i : mark) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

