import java.util.*;
public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        //will take just unique elements like set

        //insert
        set.add(10);
        set.add(11);
        set.add(11);
        set.add(12);
        System.out.println(set);


        //search- contains
        if(set.contains(11)){
            System.out.println("Contains 11");
        }

        //delete
        set.remove(12);
        if(!set.contains(12)){
            System.out.println("Removed 12");
        }

        //size
        System.out.println("Size of set : "+set.size());

        System.out.println(set);


        set.add(13);
        set.add(14);
        set.add(13);
        set.add(15);
        //iterator
        Iterator it=set.iterator();
        //hasNext, next

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }



        System.out.println();
        for(Integer i : set){
            System.out.print(i+" ");
        }
    }
}
