package LoopingPrograms.Medium;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float userNum, sum = 1;

        System.out.print("Enter a number: ");
        userNum = sc.nextInt();

        for (float i = 1; i <= userNum; i++) {
            sum += (i/(i+1));
        }

        System.out.printf("Sum: %.2f", sum);
    }

    public static void question() {
        System.out.println("'Write a program to read a number and print the sum of the series 1 + 2/3 + 3/4 + 4/5 + ... + n/(n+1).'");
    }
}
