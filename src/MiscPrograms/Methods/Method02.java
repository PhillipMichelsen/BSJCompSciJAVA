package MiscPrograms.Methods;
import java.util.Scanner;
import java.util.Random;


public class Method02 {
    public static void main(String[] args) {
        Method02Operations method02Operations = new Method02Operations();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Palindrome + Twin primes
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter another number (Larger than first): ");
        int num2 = scanner.nextInt();

        System.out.println("\nPalendromes between two given numbers: ");
        for (int i = num; i <= num2; i++) {
            if (method02Operations.checkPal(i)) {
                System.out.println(i + " is a palindrome.");
            }
        }

        System.out.println("\nTwin primes between two given numbers: ");
        for (int i = num; i <= num2; i++) {
            if (method02Operations.checkPrime(i) && method02Operations.checkPal(i+2)) {
                System.out.printf("%d and %d are twin primes.\n", i, i+2);
            }
        }

        // Arrays
        int[] arr = new int[9];
        int[] sortedArr = arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println("\n\nArray: ");
        for (int i : arr) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n\nSorted Array (Decending):");
        sortedArr = method02Operations.bSort(arr, arr.length);
        for (int i : sortedArr) {
            System.out.printf("%d ", i);
        }

        System.out.print("\n\nEnter a number: ");
        int num3 = scanner.nextInt();

        System.out.println("\nFrequency of " + num3 + " in array: " + method02Operations.freq(arr, arr.length, num3));
    }
}

class Method02Operations {
        public boolean checkPal(int num) {
            int numReversed = 0;
            int tempNum = num;

            while (tempNum != 0) {
                numReversed = (numReversed * 10) + (tempNum % 10);
                tempNum /= 10;
            }

            return num == numReversed;
        }

        public int[] bSort(int[] arr, int arrSize) {
            int temp;

            for (int i = 0; i < arrSize; i++) {
                for (int j = 0; j < arrSize - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
        }

        public int freq(int[] arr, int arrSize, int num) {
            int numFreq = 0;

            for (int currentNum : arr) {
                if (currentNum == num) {
                    numFreq++;
                }
            }

            return numFreq;
        }

        public boolean checkPrime(int num) {
            int numFactors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    numFactors++;
                }
            }

            return numFactors == 2;
        }
}