public class majority {

    public static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > arr.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int result = findMajorityElement(arr);
        System.out.println(result);
    }
}
