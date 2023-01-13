package MiscPrograms.Searching;
import java.util.Scanner;

public class BinarySearch {
    static int[] binarySearch(int[] inputArray, int searchNumber){
        int[] binarySearchOut = {0,0,0};
        int leftPointer = 0, rightPointer = inputArray.length - 1, middlePointer;

        for (int i = 0; i < inputArray.length; i++){
            middlePointer = (leftPointer + rightPointer) / 2;

            if (inputArray[middlePointer] == searchNumber) {
                binarySearchOut[0] = middlePointer;
                binarySearchOut[1] = 1;
                binarySearchOut[2] = i + 1;

                break;
            }
            else if (inputArray[middlePointer] < searchNumber) {
                leftPointer = middlePointer + 1;
            }
            else if (inputArray[middlePointer] > searchNumber) {
                rightPointer = middlePointer - 1;
            }

        }
        return binarySearchOut;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("Enter the number to be searched: ");
        int searchNumber = sc.nextInt();

        int[] numberPosition = binarySearch(inputArray, searchNumber);

        System.out.println("\nInput Array: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        if (numberPosition[1] == 1) {
            System.out.println("\n\nNumber found at position: " + numberPosition[0]);
            System.out.println("Number of iterations: " + numberPosition[2]);
        }
        else {
            System.out.println("\n\nNumber not found");
        }


    }
}
