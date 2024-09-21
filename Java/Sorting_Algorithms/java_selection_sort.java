import java.util.*;

public class java_selection_sort {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=sc.nextInt();

        int ar[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("["+i+"] -> ");
            ar[i]=sc.nextInt();
        }

        System.out.print("\nUnsorted -> ");
        for(int i=0; i<n; i++){
            System.out.print(ar[i]+" ");
        }

        int index;
        for(int i=0; i<n-1; i++){
            index=i;
            for(int j=i+1; j<n; j++){
                if(ar[index]>ar[j]){
                    index=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[index];   
            ar[index]=temp;
        } 

        System.out.print("\nSorted -> ");
        for(int i=0; i<n; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
