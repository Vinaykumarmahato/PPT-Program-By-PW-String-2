public class ReverseString {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        String reversedString = reverseStr(s, k);

        System.out.println("Reversed string: " + reversedString);
    }
}
