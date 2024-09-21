import java.util.*;

public class Bubble_Sort_Of_String {
    public static void main(String[] args) {
        String st[] = { "Shakib", "Arnab", "Anik", "Mashiat", "Niaz" };

        List<String> list = Arrays.asList(st); // Convert the array to a list

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j-1).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, j, j - 1);
                }
            }
        }

        // Convert the list back to an array
        st = list.toArray(new String[0]);

        // Print the sorted array
        for (String s : st) {
            System.out.println(s);
        }
    }
}
