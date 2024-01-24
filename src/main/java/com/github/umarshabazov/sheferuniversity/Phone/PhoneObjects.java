package com.github.umarshabazov.sheferuniversity.Phone;

public class PhoneObjects {

    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.number = 3011;
        iPhone.weight = 200;
        iPhone.model = "5S";

        iPhone.receiveCall("Chuck");
        System.out.println(iPhone.receiveCall("Chuck"));

        System.out.println(iPhone.getNumber(92553343));
        System.out.println();

        Phone android = new Phone();
        android.number = 244;
        android.weight = 350;
        android.model = "Galaxy S4";


        Phone nokia = new Phone();

        nokia.number = 500;
        nokia.weight = 1000;
        nokia.model = "5580";

        System.out.println(iPhone);
        System.out.println();

        System.out.println(android);
        System.out.println();
        System.out.println(nokia);
        System.out.println();
    }
}
