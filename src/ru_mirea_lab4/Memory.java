package ru_mirea_lab4;

public class Memory {
    private String type;
    private int size;
    private int speed;

    public Memory(String type, int size, int speed) {
        this.type = type;
        this.size = size;
        this.speed = speed;
    }

    public String getType() {return type;}
    public int getSize() {return size;}
    public int getSpeed() {return speed;}

    public void setType(String type) {this.type = type;}
    public void setSize(int size) {this.size = size;}
    public void setSpeed(int speed) {this.speed = speed;}

    public String toString() {
        return String.format("%s %dGB %dMHz", type, size, speed);
    }
}
