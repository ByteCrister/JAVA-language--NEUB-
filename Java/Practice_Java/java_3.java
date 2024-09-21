import java.util.*;
public class java_3 {
    public static int call(int a,int b){
        if(a>b)
        return a;
        else 
        return b;
    }
    public static void main(String args[]){
        System.out.print("Enter two numbers : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=call(a,b);

        System.out.print("\n Greatest among "+a+" and "+b+" = "+c);
    }
}
