import java.util.Scanner;
public class ClassSeven_2 {
    public static int sumFunction(int a ,int b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.print("Enter two integer number : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sumFunction(a,b);

        System.out.print("\n"+a+" + "+b+" = "+sum);
    }
}
