//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа


package main.java.lesson4.task27;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20 + 1));
        }
        System.out.println(list);
        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}


