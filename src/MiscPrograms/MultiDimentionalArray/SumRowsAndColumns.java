package MiscPrograms.MultiDimentionalArray;
import java.util.Random;

public class SumRowsAndColumns {
    public static void main(String[] args) {
        Random random = new Random(101);

        // Generate and fill a 2D array with random numbers (With seed 101)
        int [][] twoDimentionalArray = new int[5][5];

        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                twoDimentionalArray[row][column] = random.nextInt(100);
            }
        }

        // Print array
        for (int[] ints : twoDimentionalArray) {
            for (int column = 0; column < ints.length; column++) {
                System.out.print(ints[column] + " ");
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
