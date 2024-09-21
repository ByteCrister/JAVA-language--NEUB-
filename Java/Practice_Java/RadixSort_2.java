public class RadixSort_2 {
    public static int findDigit(int n, int i) {
        int digit = 0, loop = 0;
        while (loop != i) {
            digit = n % 10;
            n = n / 10;
            loop++;
        }
        return digit;
    }

    public static int findMax(int ar[]) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }

    public static void radixSort(int mainArray[]) {

        int OutputArray[] = new int[mainArray.length];
        int countArray[] = new int[10];

        int maxNumber = findMax(mainArray);
        int countDigit = 0;
        while (maxNumber != 0) {
            maxNumber = maxNumber / 10;
            countDigit++;
        }

        for (int j = 0; j < mainArray.length; j++) {
            OutputArray[j] = mainArray[j];
        }

        // **************here starts the main loop*****************
        for (int i = 1; i <= countDigit; i++) {

            for (int j = 0; j < mainArray.length; j++) {
                int SortDigit = findDigit(OutputArray[j], i);
                countArray[SortDigit]++;
                System.out.print(SortDigit + " "); // printing the digits //1
            }
            System.out.println();

            for (int j = 0; j < 10; j++) {
                System.out.print(countArray[j] + " "); // 2
            }
            System.out.println();

            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += countArray[j];
                countArray[j] = sum;
                System.out.print(countArray[j] + " "); // printing cumulative sum //3
            }
            System.out.println();

            for (int j = mainArray.length - 1; j >= 0; j--) {
                int index = findDigit(mainArray[j], i);

                OutputArray[--countArray[index]] = mainArray[j];
                // mainArray[--countArray[index]]=OutputArray[j];
            }

            for (int j = 0; j < 10; j++) {
                countArray[j] = 0;
            }

            // printing the outputArray each time
            for (int j = 0; j < OutputArray.length; j++) {
                System.out.print(OutputArray[j] + " "); // 4
            }

            for (int j = 0; j < mainArray.length; j++) {
                mainArray[j] = OutputArray[j];
            }
            System.out.println();
            System.out.println();
        }

    }

    public static void main(String args[]) {

        int arr[] = { 121, 432, 564, 23, 1, 45, 788 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
        radixSort(arr);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}