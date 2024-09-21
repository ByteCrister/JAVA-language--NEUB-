import java.util.*;
public class java_insertion_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int ar[]=new int[20];
      System.out.print("Enter n : ");
      int n1=sc.nextInt(),n;

      int size=0;
      for(int i=0; i<n1; i++){
        ar[i]=sc.nextInt();
        size++;
      }

      System.out.print("\nEnter n : ");
      n=sc.nextInt();
      
      int index=0,i=0;
      while(i<n){
        int value=sc.nextInt();

        for(int j=0; j<size; j++){
            if(value>ar[j]){
                index=j+1;
            }
        }

        for(int k=size-1; k>=index; k--){
            ar[k+1]=ar[k];
        }
        ar[index]=value;
        i++;
      }

      System.out.println("->");
      for(i=0; i<n+size; i++){
        System.out.print(ar[i]+" ");
      }
    }
}
