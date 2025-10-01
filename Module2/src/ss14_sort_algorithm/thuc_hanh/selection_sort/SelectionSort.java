package ss14_sort_algorithm.thuc_hanh.selection_sort;

public class SelectionSort {
    static Double[] list = {1.0, 9.0, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(Double[] doubles) {
        for (int i = 0; i < doubles.length - 1; i++) {
            Double currentMin = doubles[i];
            Integer minIndex = i;
            for (int j = i + 1; j < doubles.length; j++) {
                if (currentMin > doubles[j]) {
                    currentMin = doubles[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
