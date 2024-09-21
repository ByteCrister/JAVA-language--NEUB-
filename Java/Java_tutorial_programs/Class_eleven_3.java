import java.util.*;

public class Class_eleven_3 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row and column : ");
        int R=sc.nextInt();
        int C=sc.nextInt();

        int ar[][]=new int[R][C];

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.print("Matrix["+i+"]["+j+"]-> ");
                ar[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.print("\n[ Matrix ]\n");
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.print(ar[i][j]+"       ");
            }
            System.out.println();
        }


        int rowStart=0, rowEnd=R-1, columnStart=0,columnEnd=C-1;

        System.out.print("\nSpiral order : ");

        while(rowStart<=rowEnd && columnStart<=columnEnd){

            for(int i=columnStart; i<=columnEnd; i++){
                System.out.print(ar[rowStart][i]+" ");
            }
            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++){
                System.out.print(ar[i][columnEnd]+" ");
            }
            columnEnd--;

            if(columnStart<columnEnd){
                for(int i=columnEnd; i>=columnStart; i--){
                    System.out.print(ar[rowEnd][i]+" ");
                }
                rowEnd--;
            }

            if(rowStart<rowEnd){
                for(int i=rowEnd; i>=rowStart; i--){
                    System.out.print(ar[i][columnStart]+" ");
                }
                columnStart++;
            }

            System.out.println();
        }
    }
}
