import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_1 {
    public static void main(String[] args) {
        
        ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Float>List2=new ArrayList<>();
        ArrayList<String>List3=new ArrayList<>();
        ArrayList<Boolean>List4=new ArrayList<>();

        //Add element in end
        List1.add(10);
        List1.add(12);
        List1.add(9);
        List1.add(8);

        System.out.println(List1);

        //Add element in between
        List1.add(1,11);

        //Get element
        System.out.println(List1.get(3));

        //Set element
        int set=List1.set(0, 100);
        System.out.println("List -> "+List1+", Previous : "+set);

        //Remove element
       int previous= List1.remove(0);
       System.out.println("List -> "+List1+", Removed : "+previous);


       //Size of ArrayList
       System.out.println("Size of the List -> "+List1.size());

       //Loop
       for(int i=0; i<List1.size(); i++){
        System.out.print(List1.get(i)+" ");
       }

       //Sorting
       Collections.sort(List1);
       System.out.println(List1);

    }
}
