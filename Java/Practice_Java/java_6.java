import java.util.*;
public class java_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of inputs you want : ");
        int n=sc.nextInt();

        int s1=0,s2=0,s3=0,value;
        for(int i=1; i<=n; i++){
            System.out.print(i+") enter : ");
            value=sc.nextInt();
            if(value>0)
            s1++;
            else if(value<0)
            s2++;
            else 
            s3++;
        }

        System.out.print("\nPositive number : "+s1);
        System.out.print("\nNegative number : "+s2);
        System.out.print("\nZeros : "+s3);

    }
}
