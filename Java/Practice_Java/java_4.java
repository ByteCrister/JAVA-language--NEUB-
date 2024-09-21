import java.util.*;
public class java_4 {
    public static double radius(float a){
        float r=a*a;
        return r*3.1416;
    }
    public static int vote(int a){
        if(a>18)
        return 1;
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius : ");
        
        float a=sc.nextFloat();
        System.out.print("\nEnter  age: ");
        int b=sc.nextInt();

        int v=vote(b);
        if(v==0){
            System.out.print("\nNot eligible for voting");
        }
        else
        System.out.print("\neligible for voting");

        double r=radius(a);
        System.err.println("\nRadius = "+r);

        
    }
}
