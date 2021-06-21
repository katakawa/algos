package com.algos.arraysandstrings;

public class RotateMatrix {

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
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;
        arr[3][0] = 13;
        arr[3][1] = 14;
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

        int[][] newArr = rotateMatrix(arr);
        for (int n = 0; n < newArr.length; n++) {
            for (int m = 0; m < newArr.length; m++) {
                System.out.print(newArr[n][m] + " | ");
            }
            System.out.println();
            System.out.println("---------------------------------");
        }


    }
    
    private static int[][] rotateMatrix(int[][] arr) {
        int[][] newArr = new int[4][4];
        int length = arr.length;

        for (int n = 0; n < length; n++) {
            for (int m = 0; m < length; m++) {
                newArr[m][length - 1 - n] = arr[n][m];
            }
        }
        return newArr;
    }
    
}
