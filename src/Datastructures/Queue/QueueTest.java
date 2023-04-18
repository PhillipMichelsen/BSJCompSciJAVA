package Datastructures.Queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        Scanner scanner = new Scanner(System.in);

        // user interface to test queue, enqueue, dequeue, print, getStatus
        label:
        while (true) {
            System.out.println("\n\nCurrent status: " + queue.getStatus());
            System.out.print("Enter a command (enqueue, dequeue, print, EXIT): ");
            String command = scanner.nextLine().strip();

            switch (command) {
                case "enqueue":
                    System.out.print("Enter a value: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    queue.enqueue(value);
                    break;

                case "dequeue":
                    queue.Dequeue();
                    break;

                case "print":
                    int[] queueList = queue.getQueueArray();

                    if (queue.getStatus() == Queue.Status.EMPTY) {
                        System.out.println("\nQUEUE EMPTY...");
                    }
                    else {
                        System.out.println("\nFRONT VALUE: " + queue.getFrontValue());
                    }

                    System.out.print("\nQueue Array: ");
                    for (int j : queueList) {
                        System.out.print(j + " ");
                    }

                    System.out.printf("\nFront: %d, Rear: %d, Size: %d%n", queue.getFrontIndex(), queue.getRearIndex(), queue.getSize());

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
