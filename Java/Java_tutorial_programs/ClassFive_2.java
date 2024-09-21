import java.util.*;
public class ClassFive_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int n=sc.nextInt();

        //Butterly Pattern

        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }

            for(int k=n-r; k>0; k--){
                System.out.print("  ");
            }
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int r=n; r>0; r--){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            for(int k=1; k<=n-r; k++){
                System.out.print("  ");
            }
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n\n");
        
        
        //Solid Rombus
        for(int r=1; r<=n; r++){
            for(int k=1; k<=n-r; k++){
                System.out.print(" ");
            }
            for(int c=1; c<=n; c++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        //Number piramid
        for(int r=1; r<=n; r++){
            for(int k=1; k<=n-r;k++){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print(r+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        
        int var_1=1;
            for(int r=1; r<=n; r++){
                for(int k=1; k<=n-r; k++){
                    System.out.print(" ");
                }
                for(int c=var_1; c>0; c--){
                    System.out.print(c);
                }
                var_1++;
                for(int c=2; c<=r;c++){
                    System.out.print(c);
                }
                System.out.print("\n");
            }
            System.out.print("\n\n");

        //Diamond Pattern
        for(int r=1; r<=n; r++){
            for(int k=1; k<=n-r; k++){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            for(int c=1; c<=r-1; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int r=n; r>0; r--){
            for(int k=n-r; k>0; k--){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            for(int c=1; c<=r-1; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
            
    }
    }
