package com.github.umarshabazov;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        for (int i = 0; i < array.length - 1; i++) {


            int minIndex = i;


            for (int j = i; j < array.length; j++) {


                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }

            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(array));

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        }
    }
