//Имеется текст. Следует составить для него частотный словарь


package main.java.lesson4.task29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Alena, Alina, Alina, Albina, Arina, Albina, Albina.";
        List<String> list = Arrays.asList(text.split("[ ,.!?—:;]+"));
        Set<String> word = new HashSet<>(list);
        for (String words : word) {
            System.out.println(words + " " + Collections.frequency(list, words));
        }
    }
}

