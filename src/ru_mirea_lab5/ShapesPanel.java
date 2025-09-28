package ru_mirea_lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class ShapesPanel extends JPanel {
    private Shape[] shapes;
    private Random random;

    public ShapesPanel() {
        shapes = new Shape[20];
        random = new Random();
        generateShapes();
    }

    private void generateShapes() {
        for (int i = 0; i < 20; i++) {
            //Случайный цвет
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            //Случайная позиция
            int x = random.nextInt(256);
            int y = random.nextInt(256);

            //Случайная форма
            int shapeType = random.nextInt(3);

            switch (shapeType) {
                case 0: //Окружность:
                    int radius = 10 + random.nextInt(40);
                    shapes[i] = new Circle(color, x, y, radius);
                    break;
                case 1: // Прямоугольник:
                    int width = 20 + random.nextInt(80);
                    int height = 20 + random.nextInt(80);
                    shapes[i] = new Rectangle(color, x, y, width, height);
                    break;
                case 2: // Треугольник:
                    int base = 20 + random.nextInt(60);
                    int triangleHeight = 20 + random.nextInt(60);
                    shapes[i] = new Triangle(color, x, y, base, triangleHeight);
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Рисуем фигуры
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
