import java.util.Arrays;

public class arrayprblm {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 11, 6 };
        // swap(arr, 0, 2);
        // System.out.println(Arrays.toString(arr));

        // MAX Value in array
        // System.out.println(max(arr));

        // MAX Value in Range
        // System.out.println(maxInRange(arr, 0, 2));

        // Reversing the Array
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxInRange(int[] arr, int start, int end) {
        if (arr == null) {
            return -1;
        }
        if (end > start) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // two pointer method
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            // int temp = arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;
            swap(arr, start, end);
            end--;
            start++;
        }
    }

}
