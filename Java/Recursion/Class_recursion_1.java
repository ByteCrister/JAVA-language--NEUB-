import java.util.*;

public class Class_recursion_1 {

    public static int SumOfNumbers(int n) {

        if (n == 1)
            return 1;
       
        return n+SumOfNumbers(n-1);
    }

    public static void main(String args[]) {
        // print sum of first n natural number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("sum : " + (SumOfNumbers(n)));
    }
}