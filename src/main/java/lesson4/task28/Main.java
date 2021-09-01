//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку


package main.java.lesson4.task28;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
    }
}

