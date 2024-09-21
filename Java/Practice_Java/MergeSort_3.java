
class MergeSort_3{
    public static void Merge(int ar[], int low, int mid, int high){
        int ar2[]=new int[high-low+1];

        int index1=low;
        int index2=mid+1;

        int index=0;

        while(index1<=mid && index2<=high){
            if(ar[index1]<=ar[index2]){
                ar2[index++]=ar[index1++];
            }else{
                ar2[index++]=ar[index2++];
            }
        }
        while(index1<=mid){
                ar2[index++]=ar[index1++];
        }
        while(index2<=high){
                ar2[index++]=ar[index2++];
        }

        for(int i=0; i<ar2.length; i++){
            ar[i+low]=ar2[i];
        }


    }
    public static void mergeSort(int ar[], int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(ar,low,mid);
            mergeSort(ar,mid+1,high);

            Merge(ar,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int ar[]={4,9,1,7,2,8,3};

        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        mergeSort(ar,0,6);
        System.out.println();

        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}