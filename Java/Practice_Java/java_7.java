import java.util.*;
public class java_7 {
    public static int fibo(int i){
        if(i==0)
        return 0;
        if(i==1)
        return 1;
        return fibo(i-1)+fibo(i-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter fibo series number : ");
        int a=sc.nextInt();
        int r;
        System.out.print("\nFibonacci series -> ");
        for(int i=0; i<a; i++){
             r=fibo(i);
            System.out.print(r+" ");
        }
    }
}
