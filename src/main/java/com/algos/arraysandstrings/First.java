package com.algos.arraysandstrings;

public class First {

    public static void main(String[] args) {
        int[][] A = new int [7][3];
        A[0][0] = 5;    A[0][1] = 4;    A[0][2] = 4;
        A[1][0] = 4;   A[1][1] = 3;    A[1][2] = 4;
        A[2][0] = 3;    A[2][1] = 2;    A[2][2] = 4;
        A[3][0] = 2;    A[3][1] = 2;    A[3][2] = 2;
        A[4][0] = 3;    A[4][1] = 3;    A[4][2] = 4;
        A[5][0] = 1;    A[5][1] = 4;   A[5][2] = 4;
        A[6][0] = 4;    A[6][1] = 1;    A[6][2] = 1;

        System.out.println(new First().solution(A));
    }

    int allCountries = 0;
    boolean wasVisited[][];
    int[][] matrix;

    public int solution(int[][] A) {
        wasVisited = new boolean[A.length][A[0].length];
        matrix = A;

        int currentColor;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (wasVisited[i][j]) continue;

                allCountries++;
                currentColor = A[i][j];
                visitSurrounding(A, currentColor, i, j);
                wasVisited[i][j] = true;
            }
        }

        return allCountries;
    }

    private void visitSurrounding(int[][] A, int currentColor, int i, int j) {
        if (wasVisited[i][j]) return;
        if (A[i][j] != currentColor) return;
        wasVisited[i][j] = true;

        //go down
        int goDown = i + 1;
        while (goDown < A.length) {
            if (wasVisited[goDown][j]) break;
            if (A[goDown][j] == currentColor) {
                //wasVisited[goDown][j] = true;
                visitSurrounding(A, currentColor, goDown, j);
            }
            if (A[goDown][j] != currentColor) break;
            goDown++;
        }

        //go down
        int goUp = i - 1;
        while (goUp >= 0) {
            if (wasVisited[goUp][j]) break;
            if (A[goUp][j] == currentColor) {
                //wasVisited[goUp][j] = true;
                visitSurrounding(A, currentColor, goUp, j);
            }
            if (A[goUp][j] != currentColor) break;
            goUp--;
        }

        //go left
        int goLeft = j - 1;
        while (goLeft >= 0) {
            if (wasVisited[i][goLeft]) break;
            if (A[i][goLeft] == currentColor) {
                //wasVisited[i][goLeft] = true;
                visitSurrounding(A, currentColor, i, goLeft);
            }
            if (A[i][goLeft] != currentColor) break;
            goLeft--;
        }

        //go right
        int goRight = j + 1;
        while (goRight < A[0].length) {
            if (wasVisited[i][goRight]) break;
            if (A[i][goRight] == currentColor) {
                //wasVisited[i][goRight] = true;
                visitSurrounding(A, currentColor, i, goRight);
            }
            if (A[i][goRight] != currentColor) break;
            goRight++;
        }
    }

}
