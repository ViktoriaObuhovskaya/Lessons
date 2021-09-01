/*
Имеется строка с текстом. Подсчитать количество слов в тексте.
 Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать
*/


package main.java.lesson2.task19;

public class Main {
    public static void main(String[] args) {
        String str = " I      like     Java   !   ";
        String[] words = str.split("[ ,.!?—:;]+");
        int wordCount = 0;
        for (String word : words) {
            if (word.length() > 0)
                wordCount++;
        }
        System.out.println(wordCount);
    }
}


