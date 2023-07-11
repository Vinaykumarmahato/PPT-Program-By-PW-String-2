import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (charMap.containsKey(c1)) {
                if (charMap.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mappedChars.contains(c2)) {
                    return false;
                }

                charMap.put(c1, c2);
                mappedChars.add(c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = isIsomorphic(s, t);

        System.out.println("Are the strings isomorphic? " + isIsomorphic);
    }
}
