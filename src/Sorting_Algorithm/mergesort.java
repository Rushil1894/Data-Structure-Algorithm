package Sorting_Algorithm;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {15, 9, 3, 10, 6, 8, 6, 12};
        mergesorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesorting(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesorting(arr, low, mid);
            mergesorting(arr, mid + 1, high);
            mergearray(arr, low, mid, high);
        }
    }

    public static void mergearray(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];


        for (int i = 0; i < n1; i++)
            left[i] = arr[low + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
