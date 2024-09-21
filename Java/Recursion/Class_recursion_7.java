import java.util.Scanner;

public class Class_recursion_7 {
    public static void reverse_String(String s,int index){

        if(index==-1){
            return;
        }

        System.out.print(s.charAt(index));

        reverse_String(s, index-1);
    }

    public static void main(String args[]){

        /* reverse of a string */
        Scanner sc=new Scanner(System.in);

        String st=sc.next();

        reverse_String(st,st.length()-1);
    }
}
