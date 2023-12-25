package com.github.umarshabazov.sheferuniversity;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();


//        int[][] matrix = matrix1(m,n);
//        int[][] matrix = matrix2(m,n);
//        int[][] matrix = matrix3(m,n);


//        print(matrix,m,n);
    }

    public static int[][] matrix1(int m, int n) {

        int[][] matrix = new int[m][n];
        int a = 1; // заполняет спираль в формате алгебраической прогрессии

//        Далее идет решение 1 задачи
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = a;
                a = a + 1;
            }

        }
       return matrix;
    }


    public static int[][] matrix2(int m, int n) {

        int[][] matrix = new int[m][n];
        int a = 1; // заполняет спираль в формате алгебраической прогрессии

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = a;
                    a = a + 1;
                }
            } else {

                for (int k = n - 1; k >= 0; k--) {
                    matrix[i][k] = a;
                    a = a + 1;
                }
            }

        }
        return matrix;
    }

    //
    public static int[][] matrix3(int m1, int n1) {

        int[][] matrix = new int[m1][n1];
        int a = 1; // заполняет спираль в формате алгебраической прогрессии
        int f = 0; // f необходим, чтобы поднимать спираль наверх

        for (int i = 0; i < m1; i++) {

            //далее идет цикл для заполнения спирали слева направо
            for (int j = 0; j < n1; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = a;
                    a = a + 1;
                }
            }
            //далее идет цикл для заполнения спирали сверху вниз (по правому ребру)
            for (int j = 1; j < m1; j++) {
                if (matrix[j][n1 - 1] == 0) {
                    matrix[j][n1 - 1] = a;
                    a = a + 1;
                }

            }

            n1 = n1 - 1; // n уменьшен, чтобы не трогать заполненное правое ребро прямоугольника

            //далее идет цикл для заполнения спирали справа налево по нижнему ребру
            for (int k = n1 - 1; k >= 0; k--) {
                if (matrix[m1 - 1][k] == 0) {
                    matrix[m1 - 1][k] = a;
                    a = a + 1;
                }
            }

            m1 = m1 - 1; // аналогично уменьшению n, m уменьшен, чтобы не трогать нижнее ребро

//далее идет цикл для заполнения спирали снизу вверх по левому ребру прямоугольника
            for (int l = m1 - 1; l > 0; l--) {
                if (matrix[l][f] == 0) {
                    matrix[l][f] = a;
                    a = a + 1;
                }
            }
            f = f + 1; // увеличение f необходимо для того, чтобы не трогать заполненные ребра прямоугольника
        }
        return matrix;

    }


    public static void print (int[][] matrix, int m, int n) {
        for (int h = 0; h < m; h++) {
            int b;
            for (int hh = 0; hh < n; hh++) {
                b = matrix[h][hh];
                System.out.print(b + " ");
            }
            System.out.println("\n");
        }

    }
}

