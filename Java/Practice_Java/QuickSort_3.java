public class QuickSort_3 {
    public static int Sort(int ar[], int low, int high) {
        int i = low;
        int j = high+1;
        int pivot = ar[low];

        while (i < j) {
            i++;
             while (pivot >= ar[i]){
                i++;
             }

             j--;
            while (pivot < ar[j]){
                j--;
            }

            if (i < j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[low];
        ar[low] = ar[j];
        ar[j] = temp;

        return j;
    }

    public static void quickSort(int ar[], int low, int high) {
        if (low < high) {
            int pivotIndex = Sort(ar, low, high);
            quickSort(ar, low, pivotIndex);
            quickSort(ar, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int ar[] = { 5, 0, 7, 1, 3, 9, 2 };

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        quickSort(ar, 0, ar.length);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
