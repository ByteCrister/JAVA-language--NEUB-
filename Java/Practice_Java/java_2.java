import java.util.*;
public class java_2 {

   public static int sum(int N)
    {
        int s=0;
        for(int i=1; i<=N; i++){
            s=s+i;
        }
        return s;
    }
    public static void main(String args[]){
        System.out.print("Enter n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sum(n);

        System.err.println("\nSum from 1 - "+n+" = "+s);
    }
}
