package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum, totalShift, totalSum = 0, currentNum = 0;

        System.out.print("Enter a number: ");
        userNum = sc.nextInt();

        System.out.print("Enter shift number: ");
        totalShift = sc.nextInt();


        for (int i = 0; i <= totalShift; i++) {
            totalSum += userNum * Math.pow(10, i);
        }

        System.out.println("The sum of the generated numbers are: " + totalSum);
    }

    public static void question() {
        System.out.println("'Write a program to print the sum of n shifted series of x.'");
    }
}
