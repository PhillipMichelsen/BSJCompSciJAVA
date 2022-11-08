package LoopingPrograms.Easy;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dailyTemps = new int[10];
        int aboveTempCount = 0, belowTempCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter the temperature on day %d: ", i);
            dailyTemps[i-1] = sc.nextInt();
        }

        for (int temp : dailyTemps) {
            if (temp < 20) belowTempCount++;
            if (temp >= 20) aboveTempCount++;
        }

        System.out.printf("\nThe temperature was 20C or above on %d days, it was below 20C on %d days.", aboveTempCount, belowTempCount);
    }
}
