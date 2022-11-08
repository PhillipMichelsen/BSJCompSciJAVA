package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("\n%d times %d is %d", userNum, i, userNum * i);
        }
    }
}
