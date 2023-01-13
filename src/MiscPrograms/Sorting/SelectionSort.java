package MiscPrograms.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 12, -5, 16 };
        int temp;

        for(int currentPass=0; currentPass < array.length; currentPass++){
            int minIndex = currentPass;
            for(int currentIndex=currentPass+1; currentIndex < array.length; currentIndex++){
                if(array[currentIndex] < array[minIndex]){
                    minIndex = currentIndex;
                }
            }
            temp = array[currentPass];
            array[currentPass] = array[minIndex];
            array[minIndex] = temp;
        }

        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
