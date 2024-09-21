import java.util.*;
public class ClassSeven_3 {
    public static int fac(int x){
        if(x==0)
        return 1;

        return x*fac(x-1);

    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

       
           int f= fac(n);
           System.out.print("\nFactorial of "+n+" = "+f);
        

    }
}
