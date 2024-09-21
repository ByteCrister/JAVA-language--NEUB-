import java.util.*;
public class Class_fourteen_1 {
    public static void main(String args[]){

        // operators - symbols, Binary number system

        //binary - " +, -, *, /, %

        //unary - " --, ++ " 

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int dec=sc.nextInt();

        System.out.print("Enter binary number : ");
        int binaryNumber=sc.nextInt();
        int Binary=binaryNumber;

        int ar[]=new int[20],rem=dec,i=0;
       

        while(dec!=0){
            ar[i]=dec%2;
            dec=dec/2;
            ++i;
        }

        System.out.print("\n"+rem+" -> ");
        for(int j=i-1; j>=0; j--){
            System.out.print(ar[j]+" ");
        }
        

        int a=0101,b=0110;
        int c=(a&b);
        System.out.println("\n"+c);
        //finding decimal number using doubling method
        // int sum=0,digit;

        // while(binaryNumber!=0){
        //     digit=binaryNumber%10;
        //     sum=sum*2+digit;

        //     binaryNumber=binaryNumber/10;
        // }

        // System.out.print("\n"+Binary+" -> "+sum);

        // int digit,power,sum=0;
        // i=0;
        //     while(binaryNumber!=0){
        //         digit=binaryNumber%10;

        //         if(i<2){
        //             power=1;
        //         }
        //         sum=sum+(double)Math.pow(2,power)*digit;
        //         i++;
        //         power++;
        //     }
        // System.out.print("\n"+Binary+" -> "+sum);

    }
}
