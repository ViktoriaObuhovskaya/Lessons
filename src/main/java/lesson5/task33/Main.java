//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно


package main.java.lesson5.task33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String look = ".\\src";
        try (Stream<Path> walk = Files.walk(Paths.get(look))) {
            List<String> result = walk.filter(Files::isRegularFile)
                    .map(Path::toString).collect(Collectors.toList());
            System.out.println("File " + result.size());
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<Path> walk = Files.walk(Paths.get(look))) {
            List<String> result = walk.filter(Files::isDirectory)
                    .map(Path::toString).collect(Collectors.toList());
            System.out.println("Directory " + result.size());
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
