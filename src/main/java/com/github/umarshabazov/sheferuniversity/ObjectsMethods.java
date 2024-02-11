package com.github.umarshabazov.sheferuniversity;

import com.github.umarshabazov.sheferuniversity.Student.Grade;

public class ObjectsMethods {
    public static void main(String[] args) {


        Student ivanov = new Student("Sasha", "7");
        System.out.println(ivanov);

        Student ivanov2 = new Student("Sasha", "7");

        System.out.println(ivanov2);

        System.out.println(ivanov.equals(ivanov2));
        System.out.println(ivanov == ivanov2);

        Grade sevensGrade = new Grade();

        sevensGrade.letter = "B";
        sevensGrade.number = 7;

        System.out.println(sevensGrade);



    }
}

