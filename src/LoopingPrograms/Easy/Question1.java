package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");

            if ((sc.nextInt() % 2) == 0) {
                evenNumberCount += 1;
            }
            else {
                oddNumberCount += 1;
            }
        }

        System.out.printf("\nThere are %d even numbers and %d odd numbers.", evenNumberCount, oddNumberCount);

    }
}
