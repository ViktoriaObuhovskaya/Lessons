//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое


package main.java.lesson5.task32;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./text.txt");

        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        int[] marks = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            a.writeInt(marks[i]);
        }
        a.close();

        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        int res = dataInputStream.readInt();
        while (true) {
            System.out.print(res+" ");
            try {
                res = dataInputStream.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();

        float sum = 0;
        for (int mark : marks)
            sum += mark;
        float sr = sum / 20;
        System.out.println("\n" + sr);
    }
}
