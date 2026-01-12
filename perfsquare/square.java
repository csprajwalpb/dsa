public class square {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;

        long left = 0, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num)
                return true;
            else if (square < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
}
//Time Complexity: O(log n)