import java.util.Scanner;
public class ClassFour {
    public static void main(String args[]){

    System.out.print("Enter an integer number : ");
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int b=1,sum=0;
        while(b<=a){
            sum+=b;
            b++;
        }

        System.out.print("\nSum is "+sum);

    }
}
