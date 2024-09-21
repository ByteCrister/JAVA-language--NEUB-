import java.util.*;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        System.out.println(list);

        list.addFirst("One");
        list.addFirst("Two");
        list.addFirst("Three");

        System.out.println(list);

        list.addLast("Four");
        list.addLast("Five");
        list.addLast("Six");

        System.out.println(list);

        list.removeFirst();
        list.removeFirst();

        System.out.println(list);

        list.removeLast();
        list.removeLast();

        System.out.println(list);

        System.out.println("Size : "+list.size());

        for(String i :list){
            System.out.println(i);
        }

        list.set(0, "100");
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(0);
        System.out.println(list);

    }
}
