public class pali{
public static void main(String[] args) {
    String s = "Hello";
    String reversed = new StringBuilder(s).reverse().toString();

    if(s.equals(reversed)){
        System.out.println(s + " is a palindrome.");
    } else {
        System.out.println(s + " is not a palindrome.");
    }
}
}
//Time Complexity: O(n)