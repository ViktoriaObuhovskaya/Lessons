package main.java.lesson3.task22;

public class Time {
    private int hour;
    private int minut;
    private int second;

    Time(int second) {
        this.second = second;
    }

    Time(int hour, int minut, int second) {
        this.hour = hour;
        this.minut = minut;
        this.second = second;
    }

    void allTime() {
        System.out.println(hour * 3600 + minut * 60 + second);

    }

    void printDividedTime() {
        System.out.println(String.format("%s hours, %s minutes, %s seconds", hour, minut, second));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minut == time.minut &&
                second == time.second;
    }
}
