import java.util.*;
public class Class_ten_5 {
    public static void main(String args[]){

        int ar[]={1,3,5},c=0;

        for(int i=0; i<ar.length-1; i++){
            if(ar[i]>ar[i+1]){
            c=c+1;
             break;
            }
        }
        if(c==0){
            System.out.print("\nArray is sorted");
        }
        else{
            System.out.print("\nArray is not sorted");
        }
    }
}
