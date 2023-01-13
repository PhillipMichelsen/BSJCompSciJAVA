package MiscPrograms.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 12, -5, 16 };
        int temp;

        for(int currentPass=0; currentPass < array.length; currentPass++){
            for(int currentIndex=1; currentIndex < (array.length-currentPass); currentIndex++){
                if(array[currentIndex-1] > array[currentIndex]){
                    temp = array[currentIndex-1];
                    array[currentIndex-1] = array[currentIndex];
                    array[currentIndex] = temp;
                }
            }
        }

        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
