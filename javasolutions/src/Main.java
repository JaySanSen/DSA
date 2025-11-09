import ArraySolutions.PlusOne;
import ArraySolutions.RemoveDuplicates;
import ArraySolutions.MergeSort.MergeSort;
import Strings.StringToInteger;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 2, 1, 8, 9, 10, 11, 12, 1, 5};
        int[] result = MergeSort.mergeSort(array);
        System.out.println(Arrays.toString(result));
        // for (int num : result) {
        // System.out.println(num);
        // }
    }
}
