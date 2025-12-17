import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < n) {
            result[k++] = a[i++];
        }

        while (j < m) {
            result[k++] = b[j++];
        }

        return result;
    }
}
//Time Complexity : O(n+m)