public class Radix_sort_1 {
    public static void radixSort(int digitCount, int mainArray[]) {

        int min1 = 0, min2 = 0, loop = 0, newMin = 0;
        for (int i = 0; i < mainArray.length - 1; i++) {
            int digit1=mainArray[i];
            while (loop != digitCount) {
                min1 = digit1 % 10;
                digit1 = digit1 / 10;
                loop++;
            }
            int minValue=min1;

            loop = 0;
            for (int j = i + 1; j < mainArray.length; j++) {
                int digit2=mainArray[j];
                while (loop != digitCount) {
                    min2 = digit2 % 10;
                    digit2 = digit2 / 10;
                    loop++;
                }
                loop=0;
                if (minValue > min2) {
                    minValue=min2;
                    newMin = j;
                }
            }
            int temp = mainArray[i];
            mainArray[i] = mainArray[newMin];
            mainArray[newMin] = temp;
        }

    }

    public static int FindMaxDigit(int mainArray[]) {
        int max = 0, count = 0;
        for (int i = 0; i < mainArray.length; i++) {
            int digit=mainArray[i];
            while (digit != 0) {
                count++;
               digit=digit/10;
            }
            if (count > max)
                max = count;

            count = 0;
        }
        return max;
    }

    public static void main(String args[]) {
        int mainArray[] = { 904, 46, 5, 74, 62, 1 };

        int maxDigit = FindMaxDigit(mainArray);

        for (int i = 1; i <= maxDigit; i++) {
            radixSort(i, mainArray);
        }

        System.out.print("Array -> ");
        for (int i = 0; i < mainArray.length; i++) {
            System.out.print(mainArray[i] + " ");
        }
    }
}
