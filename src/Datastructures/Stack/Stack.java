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
        FAILED_FULL,
        FAILED_EMPTY,
        FULL,
        EMPTY
    }
    private Status currentStatus = Status.EMPTY;

    // BASIC OPERATIONS

    // Push, adds value to top of stack. Updates status accordingly
    public void push(int value) {
        if (isFull()) {
            currentStatus = Status.FAILED_FULL;
        }
        else {
            top++;
            stackArray[top] = value;
            currentStatus = Status.SUCCESS;

            if (top == size - 1) {
                currentStatus = Status.FULL;
            }
        }
    }

    // Pop, removes top value from stack. Updates status accordingly
    public void pop() {
        if (isEmpty()) {
            currentStatus = Status.FAILED_EMPTY;
        }
        else {
            top--;
            currentStatus = Status.SUCCESS;

            if (top == -1) {
                currentStatus = Status.EMPTY;
            }
        }
    }

    // getTop, returns top value from stack.
    public int getTop(){
            return stackArray[top];
    }

    // getTopIndex, returns top.
    public int getTopIndex(){
        return top;
    }

    // isEmpty, returns true if stack is empty. Internal use only
    private boolean isEmpty() {
        return (currentStatus == Status.EMPTY);
    }

    // isFull, returns true if stack is full. Internal use only
    private boolean isFull() {
        return (currentStatus == Status.FULL);
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
