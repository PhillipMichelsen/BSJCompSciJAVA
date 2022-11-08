package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = sc.nextInt();

        System.out.printf("The factors of %d are: ", userNum);

        for (int i = 1; i <= userNum; i++) {
            if (userNum % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
