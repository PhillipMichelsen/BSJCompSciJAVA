package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum, startNum, endNum;

        // Take user number
        System.out.print("Enter a number: ");
        userNum = sc.nextInt();

        // Take starting number
        System.out.print("Enter a starting number: ");
        startNum = sc.nextInt();

        // Take ending number
        System.out.print("Enter an ending number: ");
        endNum = sc.nextInt();


        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("\n%d times %d is %d", userNum, i, userNum * i);
        }
    }
}
