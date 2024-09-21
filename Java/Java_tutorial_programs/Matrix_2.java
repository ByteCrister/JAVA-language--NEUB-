import java.util.*;

public class Matrix_2 {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add(i * j);
            }

            matrix.add(row);
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
