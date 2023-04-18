package Datastructures.Stack;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        Scanner scanner = new Scanner(System.in);

        // user interface to test stack, push, pop, print, getStatus
        label:
        while (true) {
            System.out.println("\nCurrent status: " + stack.getStatus());
            System.out.print("Enter a command (push, pop, print, EXIT): ");
            String command = scanner.nextLine().strip();

            switch (command) {
                case "push":
                    System.out.print("Enter a value: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    stack.push(value);
                    break;

                case "pop":
                    stack.pop();
                    break;

                case "print":
                    int[] stackList = stack.getStackArray();

                    for (int j : stackList) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    System.out.println(stack.getTopIndex());
                    break;

                case "EXIT":
                    break label;

                default:
                    System.out.print("Invalid command");
                    break;
            }
        }
    }
}
