package SelectionSort;

public class SelectionSort {
    public void sort(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

    }
}
