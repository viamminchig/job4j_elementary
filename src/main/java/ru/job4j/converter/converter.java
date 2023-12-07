
package ru.job4j.converter;
public class converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollars = rubleToDollar(140);
        System.out.println("140 rubles are " + dollars + " dollars ");
    }
}
