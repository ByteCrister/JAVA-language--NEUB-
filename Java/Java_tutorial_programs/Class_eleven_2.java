import java.util.*;
public class Class_eleven_2
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row and column : ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int ar1[][]=new int[r][c],ar2[][]=new int[c][r];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print("Matrix["+i+"]["+j+"]-> ");
                ar1[i][j]=sc.nextInt();
            }
            System.out.print("\n");
        }

        System.out.println("\n[ Matrix ]");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(ar1[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                ar2[j][i] = ar1[i][j];
            }
        }

        System.out.println("\n[ Transpose Matrix ]");
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                System.out.print(ar2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
