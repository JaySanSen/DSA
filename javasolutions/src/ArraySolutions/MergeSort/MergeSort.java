package ArraySolutions.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        System.out.println(Arrays.toString(left));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        System.out.println(Arrays.toString(right));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combined[index] = left[i];
                index++;
                i++;
            } else {
                combined[index] = right[j];
                index++;
                j++;
            }
        }
        while (i < left.length) {
            combined[index] = left[i];
            index++;
            i++;
        }

        while (j < right.length) {
            combined[index] = right[j];
            index++;
            j++;
        }
        return combined;
    }
}
