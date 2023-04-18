package Datastructures.Queue;

import java.util.Arrays;

public class Queue {
    private int capacity;
    private int[] queueArray;

    private int front = -1;
    private int rear = -1;
    private int size = 0;

    public Queue() {
        capacity = 10;
        queueArray = new int[capacity];
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
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

    // Enqueue, adds value to rear of queue. Updates status accordingly.
    public void enqueue(int value) {
        if (isFull()) {
            currentStatus = Status.FAILED_FULL;
        }
        else {
            rear = (rear + 1) % capacity;
            queueArray[rear] = value;
            size++;

           if (size == capacity) {
                currentStatus = Status.FULL;
            }
            else {
                currentStatus = Status.SUCCESS;
            }
        }
    }

    // Dequeue, removes value from front of queue. Updates status accordingly
    public void Dequeue() {
        if (isEmpty()) {
            currentStatus = Status.FAILED_EMPTY;
        }
        else {
            front = (front + 1) % capacity;
            size--;

            if (size == 0) {
                currentStatus = Status.EMPTY;
            }
            else {
                currentStatus = Status.SUCCESS;
            }
        }
    }

    // getFrontValue, returns front value of stack.
    public int getFrontValue(){
        if (front == -1) {
            return queueArray[0];
        }
        else {
            return queueArray[front];
        }
    }

    // getFrontIndex, returns front index of stack.
    public int getFrontIndex(){
        return front;
    }

    // getSize, returns size of stack.
    public int getSize(){
        return size;
    }

    // isEmpty, returns true if stack is empty. Internal use only
    private boolean isEmpty() {
        return (currentStatus == Status.EMPTY || currentStatus == Status.FAILED_EMPTY);
    }

    // isFull, returns true if stack is full. Internal use only
    private boolean isFull() {
        return (currentStatus == Status.FULL || currentStatus == Status.FAILED_FULL);
    }


    // EXTRA OPERATIONS

    // getStatus, returns current status of stack
    public Status getStatus() {
        return currentStatus;
    }

    // getStackArray, returns whole array of stack
    public int[] getQueueArray() {
        return queueArray;
    }

    // getRearValue, returns rear value of stack.
    public int getRearValue(){
        return queueArray[rear];
    }

    // getRearIndex, returns rear index of stack.
    public int getRearIndex(){
        return rear;
    }

}
