public class buildreversal {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversed);
    }
}
//Time Complexity: O(n) due to efficient string building with StringBuilder