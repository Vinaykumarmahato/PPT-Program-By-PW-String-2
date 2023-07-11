public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;

        // Calculate the slope between the first two points
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        int dx = x1 - x0;
        int dy = y1 - y0;

        // Check the slope between the remaining points
        for (int i = 2; i < n; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            if (dx * (yi - y1) != dy * (xi - x1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}};

        boolean isStraightLine = checkStraightLine(coordinates);

        System.out.println("Do the coordinates form a straight line? " + isStraightLine);
    }
}
