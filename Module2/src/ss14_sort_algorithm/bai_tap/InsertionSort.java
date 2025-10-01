package ss14_sort_algorithm.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];// phần tử cần chèn
            int j = i - 1;
            while (j >= 0 && list[j] > key) {// Dịch các phần tử lớn hơn key sang phải
                list[j + 1] = list[j];
                j = j - 1;
            }
            // Chèn key vào vị trí đúng
            list[j + 1] = key;
        }
    }
}
