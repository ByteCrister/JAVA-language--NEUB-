public class Class_recursion_16 {
    public static int TotalPaths(int RowIndex, int ColIndex, int row, int column){

        if(RowIndex == row || ColIndex == column){
            return 0;
        }
        if(RowIndex == row-1 && ColIndex == column-1){
            return 1;
        }

        int TotalDownward = TotalPaths(RowIndex+1, ColIndex, row, column);
        int TotalRightward = TotalPaths(RowIndex, ColIndex+1, row, column);

        return TotalDownward+TotalRightward;
    }
    public static void main(String args[]){

        /* Count total paths in a maze to move from (0,0) to (n,m) */

        //conditions - we can just move on rightward and downwards

        int n =3,m=3;

        System.out.println(TotalPaths(0, 0, n, m));

    }
}
