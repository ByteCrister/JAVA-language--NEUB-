public class counting_sort_2 {
    public static int find_max(int ar[]) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int ar[] = { 2, 1, 1, 3, 3, 2, 4, 4, 1 };
        int max = find_max(ar);

        int count_array[] = new int[max + 1];
        for (int i = 0; i < ar.length; i++) {
            count_array[ar[i]]++;
        }

        int sum = 0;
        for (int i = 0; i < count_array.length; i++) {
            sum += count_array[i];
            count_array[i] = sum;
        }

        int output[]=new int[ar.length];
        for(int i=0; i<output.length; i++){
           output[--count_array[ar[i]]] = ar[i];
        }

        for(int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }
    }
}
