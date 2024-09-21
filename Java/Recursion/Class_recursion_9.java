import java.util.Scanner;

public class Class_recursion_9 {
    static int size,occur=0;
    public static void sort(int a[]){

        if(size == 1){
            if(occur == 0){
                System.out.println("Array is sorted");
            }else{
                System.out.println("Array is unsorted");
            }

            return;
        }

        if(a[size-1]<=a[size-2]){
            occur++;
        }

        size--;
        sort(a);
    }
    public static void main(String args[]){
        /* check if an array is sorted or not  */
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int ar[]= new int[n];

        for(int i=0; i<n; i++){
            ar[i]=sc.nextInt();
        }

        size=n;
        sort(ar);

    }
}
