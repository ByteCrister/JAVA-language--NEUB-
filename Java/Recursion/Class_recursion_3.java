import java.util.*;

public class Class_recursion_3 {

    public static int fibonacci(int n, int a, int b, int i){
     
        if(i<3){
            System.out.print((i-1)+" ");
        }
        if(i==n){
            return 0;
        }else{
           int c=a+b;
            System.out.print(c+" ");
            return fibonacci(n, b, c, i+1);
        }
    }
    public static void main(String args[]){

        System.out.print("Enter n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        fibonacci(n, 0, 1, 1);
    }
}
