import java.util.*;
public class Class_recursion_11 {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, String newString , int index){
        if(index == str.length()){
            System.out.println(newString);
            return ;
        }

        char ch= str.charAt(index);
        if(map[ch - 'a'] == true){
            removeDuplicates(str, newString, index+1);
        }else{
            newString+=ch;
            map[ch - 'a'] = true;
            removeDuplicates(str, newString, index+1);
        }
    }
    public static void main(String args[]){

        /* remove all duplicates from the string */

        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        System.out.println(str);

        removeDuplicates(str, "", 0);

    }
}
