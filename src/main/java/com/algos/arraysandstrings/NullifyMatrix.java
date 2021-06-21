package com.algos.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class NullifyMatrix {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;
        arr[2][0] = 9;
        arr[2][1] = 0;
        arr[2][2] = 11;
        arr[2][3] = 12;
        arr[3][0] = 13;
        arr[3][1] = 0;
        arr[3][2] = 15;
        arr[3][3] = 16;


        for (int n = 0; n < arr.length; n++) {
            for (int m = 0; m < arr.length; m++) {
                System.out.print(arr[n][m] + " | ");
            }
            System.out.println();
            System.out.println("---------------------------------");
        }

        System.out.println("");
        System.out.println("AFTER");
        System.out.println("");

        nullifyMatrix(arr);
        for (int n = 0; n < arr.length; n++) {
            for (int m = 0; m < arr.length; m++) {
                System.out.print(arr[n][m] + " | ");
            }
            System.out.println();
            System.out.println("---------------------------------");
        }
    }

    private static void nullifyMatrix(int[][] matrix) {
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new Pair(i, j));
                }
            }
        }

        for (Pair pair : list) {
            nullify(matrix, pair.n, pair.m);
        }
    }

    private static void nullify(int[][] matrix, int n, int m) {
//        for (int i = 0; i < matrix[n].length; i++) {
//            matrix[n][i] = 0;
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i][m] = 0;
//        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == n || j == m) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    static class Pair {
        int n;
        int m;

        public Pair(int n, int m) {
            this.n = n;
            this.m = m;
        }
    }
}
