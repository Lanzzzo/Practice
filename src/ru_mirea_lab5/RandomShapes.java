package ru_mirea_lab5;

import javax.swing.*;

public class RandomShapes {
    public static void main(String[] args) {
        //Основное окно
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        //Добавляем панели с фигурами
        ShapesPanel shapesPanel = new ShapesPanel();
        frame.add(shapesPanel);

        //Отображение окна
        frame.setVisible(true);
    }
}
