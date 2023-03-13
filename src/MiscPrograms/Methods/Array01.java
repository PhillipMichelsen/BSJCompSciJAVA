package MiscPrograms.Methods;
import java.util.Random;

public class Array01 {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();

        int[] array = new int[20];
        array = arrayOperations.fillArray(array);

        System.out.println("Original Array: ");
        arrayOperations.printArray(array);

        System.out.println("\n\nAverage: " + arrayOperations.calculateAverage(array));

        array = arrayOperations.sortArray(array);
        System.out.println("\nSorted Array: ");
        arrayOperations.printArray(array);
    }

}

class ArrayOperations {
    public int[] fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public int[] sortArray(int[] array) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
