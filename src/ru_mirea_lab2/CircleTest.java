package ru_mirea_lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(5.0);


        System.out.println(circle1);
        System.out.printf("Площадь: %.2f", circle1.FindArea());
        System.out.printf("\nДлина окружности: %.2f\n\n", circle1.FindLength());

        System.out.println(circle2);
        System.out.printf("Площадь: %.2f", circle2.FindArea());
        System.out.printf("\nДлина окружности: %.2f", circle2.FindLength());

        System.out.printf("\n\ncircle1 == circle2: %b", circle1.Equal(circle2));
        System.out.printf("\ncircle1 == circle3: %b", circle1.Equal(circle3));
        System.out.printf("\ncircle2 == circle3: %b", circle2.Equal(circle3));

    }
}
