import java.util.*;
public class pattern_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N : ");
        int n=sc.nextInt();
        System.out.println();

        for(int i=1; i<=n; i++){
            if(i>=1){
                for(int j=n-i; j>=1; j--){
                    System.out.print(" ");
                }
                for(int j=1; i>=j; j++){
                    if(j==1 || j==i || i==n){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}