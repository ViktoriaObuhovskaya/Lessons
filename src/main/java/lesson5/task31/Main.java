//Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать


package main.java.lesson5.task31;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./text.txt");
        FileReader reader = new FileReader(file);
        int res = reader.read();
        while (res != -1) {
            System.out.print((char) res);
            res = reader.read();
        }
        reader.close();

        String text = new String(Files.readAllBytes(Paths.get(String.valueOf(file))));
        List<Integer> integerList = text.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("\n" + integerList);

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum = sum + Integer.parseInt("" + text.charAt(i));
            }
        }
        System.out.println(sum);

        integerList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(integerList);
    }
}
