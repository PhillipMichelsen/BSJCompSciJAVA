package SelectionStatementPrograms.Easy;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userNums = new int[3]; // Generate list of length 3
        int minNum, maxNum; // Initialize min & max variables

        for (int i = 0; i < 3; i++){
            System.out.print("Enter a number: "); // User inputs
            userNums[i] = sc.nextInt();
        }

        maxNum = minNum = userNums[0]; // Declare variables

        for (int num : userNums){ // Iterate through list
            if (num > maxNum) maxNum = num; // If number is larger than current max, replace
            if (num < minNum) minNum = num; // If number is smaller than current min, replace
        }

        System.out.printf("\nLargest number is %d.", maxNum); // Print to user
        System.out.printf("\nSmallest number is %d.", minNum);
    }

    public static void question(){
        System.out.println("'Write a program that reads three integers and prints the largest and smallest of them.'");
    }
}
