package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum;
        int factorial = 1;

        System.out.print("Enter a number: ");
        userNum = sc.nextInt();

        for (int i = 1; i <= userNum; i++) {
            factorial *= i;
        }

        System.out.printf("The factorial of %d is %d", userNum, factorial);
    }
}

