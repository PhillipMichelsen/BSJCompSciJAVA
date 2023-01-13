package MiscPrograms.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 12, -5, 16, 92, 13, 42, 2, 0 };
        int temp;
        boolean swapMade;

        do {
            swapMade = false;
            for(int currentIndex=0; currentIndex < (array.length-1); currentIndex++){
                if(array[currentIndex] > array[currentIndex+1]){
                    temp = array[currentIndex];
                    array[currentIndex] = array[currentIndex+1];
                    array[currentIndex+1] = temp;
                    swapMade = true;
                }
            }
        }
        while (swapMade);

        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
