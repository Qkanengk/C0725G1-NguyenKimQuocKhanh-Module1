package ss3_array_method.thuc_hanh;

public class find_min_method {
    public static void main(String[] args) {
        int[] arr = {1, 3,-1, 4, 6, 67, 4};
        int index = minValue(arr);
        System.out.println("Min value in the array is: "+arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
