import java.util.*;
public class Class_eleven_1 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and columns : ");

        int r=sc.nextInt();
        int c=sc.nextInt();

        int ar[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Matrix["+i+"]["+j+"] -> ");
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("\nMatrix");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        
        int count=0;
        System.out.print("\nEnter number : ");
        int key=sc.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(key==ar[i][j]){
                    System.out.print("\nPosition of "+key+"-> "+i+","+j);
                    break;
                }

            count++;
            }
        }
    
        if(count==c){
            System.out.print("\n"+key+" not found !");
        }
        
    }
}
