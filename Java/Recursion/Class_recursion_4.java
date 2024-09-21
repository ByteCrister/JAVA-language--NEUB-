import java.util.*;

public class Class_recursion_4 {

    public static int power(int n, int x) {

        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }
        int inPower = power(n-1, x);

        return x*inPower;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n :");
        int n = sc.nextInt();

        System.out.println(x + " ^" + n + " -> " + (power(n, x)));
    }
}

/* Log n  */

/* import java.util.*;

public class Class_recursion_4 {

    public static int power(int n, int x) {

        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }
       if(n%2==0){
        return power(n/2, x) * power(n/2, x);
       }else{
        return power(n/2, x) * power(n/2, x) * x;
       }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n :");
        int n = sc.nextInt();

        System.out.println(x + " ^" + n + " -> " + (power(n, x)));
    }
} */
