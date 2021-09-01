//Найти в строке любые символы, кроме букв, цифр и пробелов. Подсчитать общее их количество


package main.java.lesson2.task18;

public class Main {
    public static void main(String[] args) {
        String str = "I !  1 3 5 like ,,<>  .Java,, . ";
        int totalNumber = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (!(Character.isLetterOrDigit(symbol)) && !(Character.isWhitespace(symbol)))
                totalNumber++;
        }
        System.out.println("Total number of characters " + totalNumber);
    }
}

