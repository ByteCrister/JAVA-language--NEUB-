class L_C_S {

    private String X;
    private String Y;
    private int row;
    private int column;
    private int table[][];

    private int Direction[][];
    private int diagonal = 1;
    private int left = -1;
    private int up = 0;

    L_C_S(String X, String Y) {
        this.X = X;
        this.Y = Y;
        this.row = X.length() + 1;
        this.column = Y.length() + 1;
        this.table = new int[row][column];
        this.Direction = new int[row][column];

        LCS_method();
    }

    private void initialize() {
        for (int r = 0; r < column; r++) {
            table[0][r] = 0;
        }

        for (int c = 0; c < row; c++) {
            table[c][0] = 0;
        }
    }

    public void LCS_method() {

        initialize();

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                    Direction[i][j] = diagonal;
                } else {
                    if (table[i - 1][j] >= table[i][j - 1]) {
                        table[i][j] = table[i - 1][j];
                        Direction[i][j] = up;
                    } else {
                        table[i][j] = table[i][j - 1];
                        Direction[i][j] = left;
                    }
                }
            }
        }

        print_LCS_Array();
    }

    public void print_LCS_Array() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nString -> ");
        print_string(row - 1, column - 1);
    }

    private void print_string(int i, int j) {
        if (i == 0 || j == 0) {
            return;
        } else if (Direction[i][j] == diagonal) {
            print_string(i - 1, j - 1);
            System.out.print(X.charAt(i - 1) + " ");
        } else if (Direction[i][j] == left) {
            print_string(i, j - 1);
        } else {
            print_string(i - 1, j);
        }
    }
}

public class LCM_1 {

    public static void main(String[] args) {

        new L_C_S("ACADB", "CBDA");

    }
}