package main.java.lesson3.task24;

public class Appliances {
    private boolean state;
    private String name;

    Appliances(boolean state, String name) {
        this.state = state;
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printState() {
        if (state) {
            System.out.println("on");
        } else {
            System.out.println("off");
        }
    }
}

