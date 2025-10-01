package ss14_sort_algorithm.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
