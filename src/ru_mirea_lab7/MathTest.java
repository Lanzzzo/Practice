package ru_mirea_lab7;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("Возведение в степень: " + mc1.power(2, 3));
        System.out.println("Модуль комплексного числа: " + mc1.complexModulus(3, 4));


        MathFunc mathFunc = new MathFunc();
        System.out.println("Длина окружности: " + mathFunc.circleCircumference(5));

    }
}
