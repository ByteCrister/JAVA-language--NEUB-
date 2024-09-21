import java.util.*;
public class Class_ten{
  
    public static void main(String args[]){
        // Array declaration -> Type[] arrayName = new type[ size ];

        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter number of subjects : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        int sum=0;
        float avg;

        System.out.print("\nEnter marks __\n");
        for(int i=0; i<size; i++){
            System.out.print("Subject - "+(i+1)+") : ");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }

        avg=(float)sum/size;

        System.out.print("\nPercentage : "+avg+"%");
    }
}