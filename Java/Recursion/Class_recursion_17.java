public class Class_recursion_17 {
    public static int TotalPlacements(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        int TotalVerticalPlacement = TotalPlacements(n - m, m);
        int TotalHorizontalPlacement = TotalPlacements(n - 1, m);

        return TotalHorizontalPlacement + TotalVerticalPlacement;
    }

    public static void main(String arg[]) {

        /* place tiles of size 1xm in a floor of size nXm */

        // Total ways to fit tiles on the floor - infinite tiles are given

        /*
         * the 1st way to store tiles is horizontally and 2nd one is to store vertically
         */

        System.out.println("Total ways to place the tiles : " + TotalPlacements(8, 4));

    }
}
