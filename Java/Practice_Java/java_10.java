import java.util.*;
public class java_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter an integer number : ");
        int n=sc.nextInt();

        int val_1=n/2;

        int val_2=(int)Math.pow(2,val_1);

        if(val_2 == n){
            System.out.println(n+" is a power of 2");
        }else{
            System.out.println(n+" is not power of 2");
        }
    }
}
