import java.util.*;

public class Activity_selection {
    public static void Merge(Activity Ac[], int low, int mid, int high) {
        Activity copyArray[] = new Activity[high - low + 1];
        int index1 = low;
        int index2 = mid + 1;

        int index = 0;

        while (index1 <= mid && index2 <= high) {
            if (Ac[index1].finish > Ac[index2].finish) {
                copyArray[index++] = Ac[index2++];
            } else {
                copyArray[index++] = Ac[index1++];
            }
        }

        while (index1 <= mid) {
            copyArray[index] = new Activity();
            copyArray[index++] = Ac[index1++];
        }

        while (index2 <= high) {
            copyArray[index] = new Activity();
            copyArray[index++] = Ac[index2++];
        }

        for (int i = 0; i < copyArray.length; i++) {
            Ac[low + i] = copyArray[i];
        }
    }

    public static void MergeSort(Activity Ac[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            MergeSort(Ac, low, mid);
            MergeSort(Ac, mid + 1, high);

            Merge(Ac, low, mid, high);
        }
    }

    public static class Activity {

        int start;
        int finish;

    }

    public static void main(String[] args) {

        System.out.print("Number of Activities : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Activity Ac[] = new Activity[n];

        for (int i = 0; i < Ac.length; i++) {
            Ac[i] = new Activity();
            System.out.println("\nActivity: " + (i + 1) + ")");

            System.out.print("Starting time  : ");
            Ac[i].start = sc.nextInt();

            System.out.print("Finishing time : ");
            Ac[i].finish = sc.nextInt();

        }

        MergeSort(Ac, 0, Ac.length - 1);
        for (int i = 0; i < Ac.length; i++) {
            System.out.println(Ac[i].start + " " + Ac[i].finish + " ");
        }

        Activity solution[] = new Activity[n];
        int index = 0;
        solution[index] = Ac[index];

        for (int i = 1; i < Ac.length; i++) {
            if (Ac[i].start >= solution[index].finish) {
                solution[++index] = Ac[i];
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.println("Start : " + solution[i].start + " Finish : " + solution[i].finish);
        }

        sc.close();

    }
}