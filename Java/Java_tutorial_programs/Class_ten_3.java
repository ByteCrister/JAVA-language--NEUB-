import java.util.*;
public class Class_ten_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of names : ");
        int n=sc.nextInt();

        String ar[]=new String[n];

        for(int i=0; i<n; i++){
            System.out.print("Name "+(i+1)+") ");
            ar[i]=sc.next();
        }

        System.out.print("\nList of names : ");
        for(int i=0; i<n; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
