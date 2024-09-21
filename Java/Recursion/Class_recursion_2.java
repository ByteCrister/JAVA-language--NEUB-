import java.util.Scanner;
public class Class_recursion_2 {
   
    public static int Factorial(int n){

        if(n==0)
        return 1;

        return n*Factorial(n-1);
    }
    public static void main(String args[]){

        System.out.print("Enter n : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Factorial of "+n+" -> "+(Factorial(n)));
    }
}
