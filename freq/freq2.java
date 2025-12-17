import java.util.Arrays;

public class freq2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }

        System.out.println(arr[arr.length - 1] + " -> " + count);
    }
}
//Time Complexity: O(n log n) due to sorting
