package com.github.umarshabazov.acmp;

import java.util.*;

public class InversionOfControl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Begin codding here
        int n = in.nextInt();
        in.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextLine();
        }

        Arrays.sort(array, Comparator.comparing(s -> s.length()));


        for (
                int i = 0;
                i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
