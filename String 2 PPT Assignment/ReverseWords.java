public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        result.setLength(result.length() - 1); // Remove the extra space at the end

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String reversedSentence = reverseWords(s);

        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
