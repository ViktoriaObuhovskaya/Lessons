//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов


package main.java.lesson5.task30;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./text.txt");
        try (FileWriter writer = new FileWriter(file, false)) {
            String text = "Create a file with text, read, count the number of punctuation marks and words in the text.";
            writer.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        FileReader reader = new FileReader(file);
        int res = reader.read();
        while (res != -1) {
            System.out.print((char) res);
            res = reader.read();
        }
        reader.close();

        int countWords = 0;
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int) file.length()];
        fis.read(bytesArray);
        String s = new String(bytesArray);
        String[] words = s.split(" ");
        for(String word:words){
            if (word.length() > 0)
                countWords++;
        }
        System.out.println("Word count " + countWords);

        int countMarksPunctuation = 0;
        String[] marksPunctuation = s.split("[!?,.—:;]");
        for (int i = 1; i < marksPunctuation.length; i++) {
            countMarksPunctuation++;
        }
        System.out.println("Number of punctuation marks " + countMarksPunctuation);
    }
}

