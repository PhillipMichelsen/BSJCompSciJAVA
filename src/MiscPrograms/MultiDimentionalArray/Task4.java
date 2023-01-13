package MiscPrograms.MultiDimentionalArray;
import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random(101);
        Scanner sc = new Scanner(System.in);

        // Generate and fill a 2D array with random numbers (With seed 101)
        int [][] twoDimentionalArray = new int[5][5];

        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                twoDimentionalArray[row][column] = random.nextInt(100);
            }
        }

        // Print array
        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                System.out.print(twoDimentionalArray[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("");
        // Sum of rows
        for (int row = 0; row < twoDimentionalArray.length; row++) {
            int sum = 0;
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                sum += twoDimentionalArray[row][column];
            }
            System.out.println("Sum of row " + row + ": " + sum);
        }


        System.out.println("");
        // Sum of columns
        for (int column = 0; column < twoDimentionalArray[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < twoDimentionalArray.length; row++) {
                sum += twoDimentionalArray[row][column];
            }
            System.out.println("Sum of column " + column + ": " + sum);
        }
    }
}
