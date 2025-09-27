package ru_mirea_lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5.1, 12);

        ball.setXY(5.2, 3.7);
        System.out.println(ball.toString());

        ball.move(0.2, 6.4);
        System.out.println(ball.toString());
    }
}
