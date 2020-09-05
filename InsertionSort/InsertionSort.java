package InsertionSort;

public class InsertionSort {
    public void sort(int[] array) {
        int temp, j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;

        }
    }
}
