package main.java.lesson1.task13;

public class Main {
    public static void main(String[] args) {
        String str = "абвгд";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reverse);
    }
}
