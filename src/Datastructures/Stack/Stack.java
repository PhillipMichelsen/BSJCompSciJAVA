package Datastructures.Stack;
public class Stack {
    private int size;
    private int[] stackArray;
    private int top = -1;

    public Stack(int size) {
        this.size = size;
        stackArray = new int[size];
    }

    public enum Status{
        SUCCESS,
        FULL,
        EMPTY
    }
    private Status currentStatus = Status.SUCCESS;

    // BASIC OPERATIONS

    // Push, adds value to top of stack. Updates status accordingly
    public void push(int value) {
        if (isFull()) {
            currentStatus = Status.FULL;
        }
        else {
            top++;
            stackArray[top] = value;
            currentStatus = Status.SUCCESS;
        }
    }

    // Pop, removes top value from stack. Updates status accordingly
    public void pop() {
        if (isEmpty()) {
            currentStatus = Status.EMPTY;
        }
        else {
            top--;
            currentStatus = Status.SUCCESS;
        }
    }

    // getTop, returns top value from stack.
    public int getTop(){
            return stackArray[top];
    }

    // isEmpty, returns true if stack is empty. Internal use only
    private boolean isEmpty() {
        return (top == -1);
    }

    // isFull, returns true if stack is full. Internal use only
    private boolean isFull() {
        return (top == size - 1);
    }


    // EXTRA OPERATIONS

    // getStatus, returns current status of stack
    public Status getStatus() {
        return currentStatus;
    }

    // getStackArray, returns whole array of stack
    public int[] getStackArray() {
        return stackArray;
    }

}
