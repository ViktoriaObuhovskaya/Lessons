package main.java.lesson7.task35;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CashDesk extends Thread {
    private String threadName;

    public CashDesk(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        try {
            for (int i = 1; i < 7; i++) {
                List<String> products = Arrays.asList(
                        "kefir, oranges, pasta",
                        "baguette, cookies, rice",
                        "apples, tomatoes, cabbage",
                        "apricots, peanut, ham",
                        "cheese, cocoa, melon");
                Random rand = new Random();
                String randomElement = products.get(rand.nextInt(products.size()));

                System.out.println("At the cash desk " + threadName + " customer " + i
                        + " bought " + randomElement);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cash desk " + threadName + " completed");
    }
}
