package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum, totalSum = 0;
        String currentNum;

        System.out.print("Enter a number: ");
        userNum = sc.nextInt();

        for (int i = 1; i <= userNum; i++) {
            currentNum = Integer.toString(userNum).repeat(i);
            totalSum += Integer.parseInt(currentNum);
        }

        System.out.println("The sum of generated numbers are: " + totalSum);


    }
}
