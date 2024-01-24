package com.github.umarshabazov.sheferuniversity;

public class Utility {

    public static final double PI = 3.1415926;

    public static void main(String[] args) {

        String name = "Vladimir Shefer";
        int length = 20;

        System.out.println(toFixedLength(name, length));
        System.out.println(toFixedLength(name, length).length());
    }


    public static int negate(int number) {

        return -number;

    }

    public static int sqr(int number) {

        return number * number;
    }

    public static int sum(int number, int number2) {

        return number + number2;
    }


    public static String toFixedLength(String str, int length) {

        int missingLength = length - str.length();
        String gap = "";
        for (int i = 0; i < missingLength; i++) {
            gap = gap + " ";
        }
        return str + gap;
    }

    public static double getPi() {

        return 3.14159;
    }

    public static double circumference(double r) {

        double PI = 3;

        return 2 * Math.PI * r;
    }

    public static double circumference2(double d) {

        return PI * d;
    }

    public static double findRadius(double circumference) {

        return circumference / (2 * PI);
    }


}
