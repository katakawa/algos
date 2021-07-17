package com.algos.pointer;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] inputNums) {
        int[] output = new int[inputNums.length];
        int currentIndex = inputNums.length - 1;
        int pointerOne = 0;
        int pointerTwo = inputNums.length - 1;

        while (pointerOne <= pointerTwo) {
            int tmpLeft = inputNums[pointerOne] * inputNums[pointerOne];
            int tmpRight = inputNums[pointerTwo] * inputNums[pointerTwo];

            if (tmpLeft > tmpRight) {
                output[currentIndex] = tmpLeft;
                currentIndex--;
                pointerOne++;
            } else {
                output[currentIndex] = tmpRight;
                currentIndex--;
                pointerTwo--;
            }
        }
        return output;
    }
}
