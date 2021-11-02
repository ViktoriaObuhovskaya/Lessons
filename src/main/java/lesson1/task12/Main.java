package main.java.lesson1.task12;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        Collections.rotate(Arrays.asList(arr), +1);
        System.out.println(Arrays.toString(arr));
    }
}
