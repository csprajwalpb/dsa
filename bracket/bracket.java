import java.util.Stack;

public class bracket {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack is empty → no matching opening
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty → balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{[()]}";
        System.out.println(isBalanced(expr));
    }
}
//Time Complexity: O(n) where n is the length of the string