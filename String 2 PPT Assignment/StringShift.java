public class StringShift {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String doubleS = s + s;
        
        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean canShift = rotateString(s, goal);

        System.out.println("Can the string be transformed after shifting? " + canShift);
    }
}
