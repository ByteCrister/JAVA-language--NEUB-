import java.util.*;

class items {
    int weight;
    int value;
}

class mainClass {
    private int row;
    private int column;
    private int T[][];
    private items IT[];

    mainClass(int weight, int items) {
        row = items + 1;
        column = weight + 1;
        T = new int[row][column];
    }

    void Finding_T(items item[]) {
        initialize();
        IT = item;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {

                if (j - item[i - 1].weight < 0) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = Math.max(T[i - 1][j], item[i - 1].value + T[i - 1][j - item[i - 1].weight]);
                }

            }
        }
    }

    private void initialize() {
        for (int i = 0; i < column; i++) {
            T[0][i] = 0;
        }
        for (int i = 0; i < row; i++) {
            T[i][0] = 0;
        }
    }

    void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    void findItems() {
        int i = row - 1, j = column - 1;
        while (i > 0 && j > 0) {
            if (T[i][j] == T[i - 1][j]) {
                System.out.println(" Item - "+i+1+" : 0");
                i--;
            } else {
                System.out.println("Item - " + i+1+" : 1");
                i--;
                j = j - IT[i].weight;
            }
        }
    }

    void findItems_2(int i, int j){
        if(i==0 || j==0){
            return;
        }
        if (T[i][j] == T[i - 1][j]) {
                System.out.println(" Item - "+i+1+" : 0");
                i--;
            } else {
                System.out.println("Item - " + i+1+" : 1");
                i--;
                j = j - IT[i].weight;
            }
            findItems_2(i, j);
    }

}

class Knapsack_1 {
    public static void main(String[] args) {
        System.out.print("Number of items  and maximum capacity: ");
        Scanner sc = new Scanner(System.in);

        int numberOfItems = sc.nextInt();
        int capacity = sc.nextInt();
        // sc.nextLine();
        items ob[] = new items[numberOfItems];

        for (int i = 0; i < numberOfItems; i++) {
            ob[i] = new items();
            System.out.print(i + 1 + " ) Enter value and weight : ");
            ob[i].value = sc.nextInt();
            ob[i].weight = sc.nextInt();
        }

        mainClass en = new mainClass(capacity, numberOfItems);
        en.Finding_T(ob);
        en.print();

        en.findItems();
        en.findItems_2(numberOfItems, capacity);

        sc.close();
    }
}