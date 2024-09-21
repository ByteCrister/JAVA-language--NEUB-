import java.util.*;
public class Array_List_1 {
    public static void main(String[] args) {
        Integer ar[]={10,57,91,94,26};

        List<Integer>list=Arrays.asList(ar);
        int max=Math.max(list.get(1), list.get(3));
        System.out.println(max);

        ar=list.toArray(new Integer[list.size()]);
    }
}
