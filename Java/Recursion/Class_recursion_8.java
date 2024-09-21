import java.util.Scanner;

public class Class_recursion_8{
    public static void occurrence(String s, char ch, int index, int first, int last, int occur){

        if(index == s.length()-1){
        System.out.print("\nFirst occur at index: "+first);
        System.out.print("\nLast occur at index : "+last);
        return;
        }

        if(s.charAt(index) == ch){
            occur++;
            last=index;

            if(occur == 1){
                first=index;
            }
        }
        
        occurrence(s, ch, index+1, first, last, occur);

    }
    public static void main(String args[]){

        /* find the first and last occurrence of given character from a string */

        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine();

        occurrence(s,'a',0,0,0,0);

    }
}
