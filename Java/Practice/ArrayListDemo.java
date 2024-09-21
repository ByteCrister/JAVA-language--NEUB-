import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        int Size = list.size();
        for(int i=0; i<Size; i++){
            System.out.println("Popped : "+list.remove(0));
        }
    }
}
