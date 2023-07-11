import java.util.Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean isEqual = backspaceCompare(s, t);

        System.out.println("Are the strings equal after backspacing? " + isEqual);
    }
}
