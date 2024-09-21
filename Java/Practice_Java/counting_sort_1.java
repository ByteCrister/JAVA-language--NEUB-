public class counting_sort_1 {
    public static int CountingSort(int mainArray[],int element, int index, int End){
        for(int i=0; i<End; i++){
            mainArray[index] = element;
            index++; 
        }
        return index;
    }

    public static void OccurOfElements(int arrayOccur[], int mainArray[]) {
        int arrayStore[] = new int[arrayOccur.length];

        for (int i = 0; i < mainArray.length; i++) {
            int index = mainArray[i];
            arrayStore[index] = mainArray[i];

            if (mainArray[i] == arrayStore[index]) {
                arrayOccur[index] += 1;
            }
        }
    }

    public static int max(int Arr[]) {
        int maximum = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if (maximum < Arr[i]) {
                maximum = Arr[i];
            }
        }
        return maximum + 2;
    }

    public static void main(String args[]) {
        int ArrayElements[] = { 2, 1, 2, 3, 1, 2, 4 };
        int ArrayEnd = max(ArrayElements);

        int OccurringArray[] = new int[ArrayEnd];
        OccurOfElements(OccurringArray, ArrayElements);

        // for(int i=0; i<OccurringArray.length; i++){
        // System.out.print(OccurringArray[i]+" ");
        // }
            int index = 0;
        for(int i=0; i<OccurringArray.length; i++){
             index = CountingSort(ArrayElements,i,index,OccurringArray[i]);
        }

        System.out.print("Sorted array -> ");
        for(int i=0; i<ArrayElements.length; i++){
            System.out.print(ArrayElements[i]+" ");
        }
    }
}