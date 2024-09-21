import java.util.*;
public class Class_ten_4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int ar[]={4,1,5,6,8,3,2},min=ar[0],max=ar[0];

        for(int i=1; i<ar.length; i++){
            if(ar[i]<min){
                min=ar[i];
            }
            if(ar[i]>max){
                max=ar[i];
            }
        }

        System.out.print("\nMaximum : "+max+", Minimum : "+min);

    }
}
