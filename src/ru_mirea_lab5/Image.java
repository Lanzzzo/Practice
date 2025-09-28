package ru_mirea_lab5;

import java.awt.*;
import javax.swing.*;

public class Image {
    public static void main(String[] args) {
        // Проверка наличия аргумента командной строки
        if (args.length == 0) {
            System.err.println("Путь к изображению не указан в аргументах командной строки.");
            return;
        }

        // Создание основного окна
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загрузка изображения
        ImageIcon imageIcon = new ImageIcon(args[0]);

        // Проверка загрузки изображения
        if (imageIcon.getIconWidth() == -1) {
            System.err.println("Не удалось загрузить изображение: " + args[0]);
            return;
        }

        // Создание компонента для отображения изображения
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Настройка и отображение окна
        frame.pack();
        frame.setLocationRelativeTo(null); // Центрирование окна
        frame.setVisible(true);
    }
}