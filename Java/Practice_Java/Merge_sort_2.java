public class Merge_sort_2 {
    public static void CallMerge(int ar[], int st, int end, int mid) {
        int copy[]=new int[end-st+1];
        int index1=st;
        int index2=mid+1;
        int copyIndex=0;

        while(index1 <=mid && index2<=end){
            if(ar[index1]<=ar[index2]){
                copy[copyIndex++]=ar[index1++];
            }else{
                copy[copyIndex++]=ar[index2++];
            }
        }

        while(index1<=mid){
            copy[copyIndex++]=ar[index1++];
        }

        while(index2<=end){
            copy[copyIndex++]=ar[index2++];
        }

        for(int i=0; i<copy.length; i++){
            ar[i+st]=copy[i];
        }
    }

    public static void CallDivide(int ar[], int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = st +(end-st)/ 2;
        CallDivide(ar, st, mid);
        CallDivide(ar, mid + 1, end);

        CallMerge(ar, st, end, mid);
    }

    public static void main(String[] args) {
        int ar[] = { 6, 1, 3, 4, 2, 5 };
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        CallDivide(ar, 0, ar.length - 1);

        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}