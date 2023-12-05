package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(5, 1, 3, 2);
        System.out.println("result (5, 1) to (3, 2) " + result);

        result = Point.distance(11, 6, 5, 3);
        System.out.println("result (11, 6) to (5, 3) " + result);
    }
}