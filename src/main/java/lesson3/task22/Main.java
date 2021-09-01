package main.java.lesson3.task22;

public class Main {
    public static void main(String[] args) {
        Time obj1 = new Time(127);
        Time obj2 = new Time(5, 2, 36);
        System.out.println("Object 1: total number of seconds ");
        obj1.allTime();
        System.out.println("Object 2: total number of seconds ");
        obj2.allTime();
        System.out.println("Object 1: ");
        obj1.printDividedTime();
        System.out.println("Object 2: ");
        obj2.printDividedTime();
        System.out.println("Object comparison " + obj1.equals(obj2));
    }
}
