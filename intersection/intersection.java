import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num); 
            }
        }

        System.out.println("Intersection: " + result);
    }
}
//Time Complexity: O(n + m), where n and m are the lengths of arr1 and arr2 respectively.