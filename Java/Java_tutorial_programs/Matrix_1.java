import java.util.*;

public class Matrix_1 {
    public static void main(String[] args) {
        // Define the number of rows and columns in the matrix
        int rows = 3;
        int columns = 4;

        // Create a 2D list (list of lists) to represent the matrix
        List<List<Integer>> matrix = new ArrayList<>();

        // Populate the matrix with values
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                // Add values to the current row
                row.add(i * columns + j);
            }
            // Add the current row to the matrix
            matrix.add(row);
        }

        // Access and print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = matrix.get(i).get(j);
                System.out.print(value + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }
}
