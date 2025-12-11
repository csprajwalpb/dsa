public class reverse {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--) {
            rev += s.charAt(i);
        }
         System.out.println("Reversed String: " + rev);
    }
}
//Time Complexity: O(n^2) due to string concatenation in a loop