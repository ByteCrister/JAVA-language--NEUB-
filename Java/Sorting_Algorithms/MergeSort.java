public class MergeSort {
    public static void merge(int ar[], int srt, int mid, int end) {

        int Merged[] = new int[end - srt + 1];
        int indx1 = srt, indx2 = mid + 1, Mindx = 0;

        while (indx1 <= mid && indx2 <= end) {
            if (ar[indx1] < ar[indx2]) {
                Merged[Mindx++] = ar[indx1++];
            } else {
                Merged[Mindx++] = ar[indx2++];
            }
        }

        while (indx1 <= mid) {
            Merged[Mindx++] = ar[indx1++];
        }
        while (indx2 <= end) {
            Merged[Mindx++] = ar[indx2++];
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < Merged.length; i++) {
            ar[srt + i] = Merged[i];
        }
    }

    public static void divide(int ar[], int srtIndex, int endIndex) {
        if (srtIndex >= endIndex) {
            return;
        }

        int mid = (srtIndex + endIndex) / 2;
        divide(ar, srtIndex, mid);
        divide(ar, mid + 1, endIndex);

        merge(ar, srtIndex, mid, endIndex);
    }

    public static void main(String args[]) {
        int ar[] = { 6, 3, 9, 5, 2, 8 };
        int n = ar.length;
        divide(ar, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
