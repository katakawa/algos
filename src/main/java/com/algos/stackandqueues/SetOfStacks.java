package com.algos.stackandqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SetOfStacks {

    private List<Stack<Integer>> stacks = new ArrayList<>();

    private int latestStackIndex = -1;

    public void push(int data) {
        if (latestStackIndex == -1) {
            latestStackIndex++;
            stacks.add(latestStackIndex, new Stack<Integer>(new StackNode<>(data)));
        }
        if (stacks.get(latestStackIndex).getElementsInStack() == 5) {
            latestStackIndex++;
            stacks.add(latestStackIndex, new Stack<Integer>(new StackNode<>(data)));
        }
        stacks.get(latestStackIndex).push(data);
    }

    public int pop() {
        if (latestStackIndex == -1) {
            return 0;
        }
        int data = stacks.get(latestStackIndex).pop();
        if (stacks.get(latestStackIndex).getElementsInStack() == 0) {
            stacks.remove(latestStackIndex);
            latestStackIndex--;
        }
        return data;
    }

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        setOfStacks.push(8);
        setOfStacks.push(9);
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        setOfStacks.push(8);
        setOfStacks.push(9);
        System.out.println();
        new ArrayList<>().isEmpty();
    }


}
