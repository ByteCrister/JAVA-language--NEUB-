import java.util.*;
public class Class_ten_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int ar[]=new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("Array["+i+"] -> ");
            ar[i]=sc.nextInt();
        }
        
        System.out.print("\nArray elements : ");        //ArraySize-> arrayName.length
        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]+" ");
        }

        System.out.print("\nEnter number : ");
        int key=sc.nextInt();

        int i=0;
        while(i!=n && key!=ar[i]){
            i++;
        }
        if(i==n){
            System.out.print("\nElement not found !");
        }
        else{
            System.out.print("Position of "+key+"-> "+(i+1));
        }
    }
}
