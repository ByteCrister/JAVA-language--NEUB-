import java.util.HashSet;

public class Class_recursion_13 {

    public static void Subsequences(String str, String newString, int index, HashSet<String>set){

        if(index == str.length()){
            if(set.contains(newString))
            return;

            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char ch = str.charAt(index);

        //add to the string 
        Subsequences(str, newString +  ch , index+1,set);
        
        // or not
        Subsequences(str, newString , index+1,set); 
    }

    public static void main(String args[]){

        /* print all the unique subsequences of a string */

        String str="aaa";

        HashSet<String> set = new HashSet<>();

        Subsequences(str, "", 0, set);
    }
}
