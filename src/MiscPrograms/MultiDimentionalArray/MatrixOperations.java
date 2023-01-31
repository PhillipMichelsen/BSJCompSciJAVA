package MiscPrograms.MultiDimentionalArray;

import java.util.Scanner;
import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Input number of rows: ");
        int M = sc.nextInt();

        System.out.print("Input number of columns: ");
        int N = sc.nextInt();
        if (N < 2 || N > 22 || M < 2 || M > 22) {
            System.out.println("\nError: Number of columns/rows must be between 2 and 22");
            System.exit(0);
        }


        int[][] A = new int[M][N];

        // Insert random values into matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(100);
            }
        }

        // Part A
        System.out.println("\n\nPart A: Unsorted Array :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Part B
        int max = A[0][0];
        int min = A[0][0];
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    maxRow = i;
                    maxCol = j;
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        System.out.printf("\n\nPart B: Max value + location: %d (%d, %d)%n", max, maxRow, maxCol);
        System.out.printf("Part B: Min value + location: %d (%d, %d)%n", min, minRow, minCol);



        // Part C
        int temp;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int tempi = 0; tempi < M; tempi++) {
                    for (int tempj = 0; tempj < N; tempj++) {
                        if (A[i][j] < A[tempi][tempj]) {
                            temp = A[i][j];
                            A[i][j] = A[tempi][tempj];
                            A[tempi][tempj] = temp;
                        }
                    }
                }
            }
        }

        // Part D
        System.out.println("\n\nPart C: Sorted Matrix :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
