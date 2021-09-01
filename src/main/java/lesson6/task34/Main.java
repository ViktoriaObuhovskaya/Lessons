package main.java.lesson6.task34;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "./text.txt";
        List<Books> books = Arrays.asList(
                new Books("White nights", "Fyodor Dostoevsky"),
                new Books("War and Peace", "Leo Tolstoy"),
                new Books("Anna Karenina", "Leo Tolstoy"),
                new Books("The Brothers Karamazov", "Fyodor Dostoevsky"),
                new Books("The Master and Margarita", "Mikhail Bulgakov"));
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(books);
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Books> newbooks;
        newbooks = (List<Books>) inputStream.readObject();
        inputStream.close();

        newbooks.stream()
                .collect(Collectors.groupingBy(Books::getAuthor))
                .entrySet().forEach(System.out::println);
    }
}
