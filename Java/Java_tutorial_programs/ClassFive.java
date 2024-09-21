import java.util.*;
public class ClassFive {
    public static void main(String args[]){
        
        System.out.print("Enter an integer : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Solid Rectangle
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n+1; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");
        //Hollow Rectangle
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n+1; c++){
                if(r==1 || r==n || c==1 || c==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n\n");
        //Half Piramid
        for(int r=1; r<=n; r++){
            for(int c=1;c<=r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Inverted half piramid
        for(int r=n; r>0; r--){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Inverted half piramid ~ by 180 degree
        for(int r=1; r<=n; r++){
            for(int k=n-r; k>0; k--){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Half Piramid with numbers
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Inverted half piramid with numbers
        for(int r=n; r>0; r--){
            for(int c=1; c<=r; c++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Floyd's triangle
        int p=1;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print((p++)+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        //o-1 Triangle
        int num=1;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print(num%2);
                num++;
            }
            System.out.print("\n");
        }
    }
}
