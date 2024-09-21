public class QuickSort {
    public static int partition(int ar[], int srt, int end) {
        int pivotElement = ar[srt];
        int i = srt;

        for (int j = srt + 1; j <= end; j++) {
            if (ar[j] <= pivotElement) {
                i++;

                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        int temp = ar[i];
        ar[i] = ar[srt];
        ar[srt] = temp;

        return i; // returning pivot's index
    }

    public static void quickSort(int ar[], int srt, int end) {
        if (srt < end) {
            int pivotIndex = partition(ar, srt, end);
            quickSort(ar, srt, pivotIndex - 1);
            quickSort(ar, pivotIndex + 1, end);
        }
    }

    public static void main(String args[]) {
        int ar[] = { 3, 4, 1, 2, 11, 10, 5, 8, 7, 6 };
        int n = ar.length;
        quickSort(ar, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}

