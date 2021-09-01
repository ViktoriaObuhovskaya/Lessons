//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка


package main.java.lesson4.task26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(list);
        list.removeIf(Integer -> Integer <= 4);
        System.out.println(list);
    }
}

