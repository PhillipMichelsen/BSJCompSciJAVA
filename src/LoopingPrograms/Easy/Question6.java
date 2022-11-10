package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;

        System.out.print("Enter a number: ");
        int userNum = sc.nextInt();

        for (int i = 2; i < userNum; i++) {
            if (userNum % i == 0){
                System.out.printf("%d is not a prime number.", userNum);
                isPrime = true;
                break;
            }
        }

        if (!isPrime) System.out.printf("%d is a prime number.", userNum);
    }

    public static void question() {
        System.out.println("'Write a program to check whether a given number is prime or not.'");
    }
}
