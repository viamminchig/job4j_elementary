package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = height * 1.15D;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = height * 1.15D;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 100;
        double man = Fit.manWeight(height);
        System.out.println("Man 100 is " + man);

        height = 110;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 110 is " + woman);
    }

}