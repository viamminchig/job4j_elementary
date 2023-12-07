package ru.job4j.calculator;

public class mathFunc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = ru.job4j.calculator.mathFunc.func1(3);
        int result2 = ru.job4j.calculator.mathFunc.func2(5);
        int total = result1 + result2;
        System.out.println(total);

        int result3 = ru.job4j.calculator.mathFunc.func1(100);
        System.out.println(result3);
    }
}