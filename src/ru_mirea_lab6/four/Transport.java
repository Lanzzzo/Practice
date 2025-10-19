package ru_mirea_lab6.four;

public class Transport implements Nameable {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
