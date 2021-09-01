//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов


package main.java.lesson2.task20;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java!";
        String[] words = str.split("[ ,.!?—:;]+");
        for (String word : words) {
            System.out.print(word.charAt(word.length() - 1));
        }
    }
}

