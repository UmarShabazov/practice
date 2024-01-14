package com.github.umarshabazov.sheferuniversity;

public class ObjectsMethods {
    public static void main(String[] args) {

        Student ivanov = new Student();

        ivanov.name = "Sasha";
        ivanov.grade = "7";


        System.out.println(ivanov);

        Student ivanov2 = new Student();
        ivanov2.name = "Sasha";
        ivanov2.grade = "7";

        System.out.println(ivanov2);

        System.out.println(ivanov.equals(ivanov2));
        System.out.println(ivanov==ivanov2);

    }
}

