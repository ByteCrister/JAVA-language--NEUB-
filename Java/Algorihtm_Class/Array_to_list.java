import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_list {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i + i * i;
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        
        int max = Math.max(list.get(8), list.get(9));
        System.out.println("Max: " + max);

        array=list.toArray(new Integer [0]);
    }
}
