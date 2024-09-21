import java.util.Scanner;

public class Class_recursion_6{
    public static void towerOfhanoi(int n,String src, String helper, String destination){

        if(n==1){

            System.out.println("Transfer disk "+n+" from "+src+" to "+destination);
            return;
        }
        towerOfhanoi(n-1, src, destination, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+destination);
        towerOfhanoi(n-1, helper, src, destination);
    }
    public static void main(String args[]){

        /***************** Tower Of Hanoi *******************/

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of disk : ");
        int n=sc.nextInt();

        String source="source",helper="helper",destination="destination";
        towerOfhanoi(n,source,helper,destination);

    }
}