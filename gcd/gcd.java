public class gcd {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD: " + gcd(a, b));
    }
}
//Time Complexity: O(log(min(a, b)))