package com.algos.stackandqueues;

import java.util.Stack;

public class Asteroid {

    public static void main(String[] args) {

    }

    public static int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length <= 1) return asteroids;
        
        Stack<Integer> stack = new Stack<>();

        for (int asteriod : asteroids) {
            if (asteriod > 0) {
                stack.push(asteriod);
            } else {
                // pop all asteroids which are less than the current asteroid
                while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteriod)) stack.pop();
                if (stack.isEmpty() || stack.peek() < 0) stack.push(asteriod);
                else if (stack.peek() == Math.abs(asteriod)) stack.pop();
            }
        }
        
        int[] output = new int[stack.size()];
        for (int i = output.length - 1; i >= 0; i--) output[i] = stack.pop();
        
        return output;
    }
}