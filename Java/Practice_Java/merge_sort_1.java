public class merge_sort_1 {
    public static void CallMerge(int ar[], int st, int mid, int end) {

        int merge[] = new int[end - st + 1];
        int indx1 = st, indx2 = mid + 1, index = 0;

        while (indx1 <= mid && indx2 <= end) {
            if (ar[indx1] > ar[indx2]) {
                merge[index++] = ar[indx2++];
            } else {
                merge[index++] = ar[indx1++];
            }
        }

        while (indx1 <= mid) {
            merge[index++] = ar[indx1++];
        }
        while (indx2 <= end) {
            merge[index++] = ar[indx2++];
        }

        for (int i = 0; i < merge.length; i++) {
            ar[st + i] = merge[i];
        }

    }

    public static void CallDivide(int ar[], int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = (st + end) / 2;
        CallDivide(ar, st, mid);
        CallDivide(ar, mid + 1, end);

        CallMerge(ar, st, mid, end);
    }

    public static void main(String args[]) {
        int ar[] = { 3, 1, 5, 2, 7, 18, 12, 11, 14, 10 };
        int n = ar.length;
        CallDivide(ar, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
