import java.util.ArrayList;

public class Class_recursion_19 {
    public static void printSubset(ArrayList subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList subset){

        if(n == 0){
            printSubset(subset);
            return ;
        }

        //add elements
        subset.add(n);
        findSubsets(n-1, subset);

        //remove elements
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String args[]){

        /* print all the subsets of a set of first n natural numbers  */

        ArrayList<Integer>subset = new ArrayList<>();
        findSubsets(3,subset);
    }
}
