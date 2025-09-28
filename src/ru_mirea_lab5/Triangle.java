package ru_mirea_lab5;

import java.awt.*;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(Color color, int x, int y, int base, int height) {
        super(color, x, y);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x - base / 2, x + base / 2};
        int[] yPooints = {y, y + height, y + height};
    }
}
