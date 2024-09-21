import java.util.*;
public class java_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two integer number : ");

        int a=sc.nextInt();
        int b=sc.nextInt();

        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.print("\nGCD : "+a);
    }
}
