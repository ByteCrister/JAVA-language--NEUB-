import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        int i = 0;
        while (i != 8) {
            System.out.println("\n\n1) Add ");
            System.out.println("2) Set ");
            System.out.println("3) Get ");
            System.out.println("4) Remove ");
            System.out.println("5) Add between ");
            System.out.println("6) Sort ");
            System.out.println("7) Print List ");
            System.out.println("8) Exist \n\n");
            System.out.print("Enter option : ");

            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("[ Add executes ]");
                    System.out.print("How many numbers you will Add ?  -> ");
                    int n = sc.nextInt();
                    for (int j = 1; j <= n; j++) {
                        System.out.print("\n[ " + j + " ]" + " : \n");
                        int var = sc.nextInt();
                        List1.add(var);
                    }
                    break;
                case 2:
                    System.out.println("[ Set executes ]");
                    System.out.print("How many numbers you will set ?  -> ");
                    n = sc.nextInt();
                    for (int j = 1; j <= n; j++) {
                        System.out.println("\n<- [ " + j + " ]" + " -> \n");

                        System.out.print("Index : ");
                        int index = sc.nextInt();
                        System.out.print("Value : ");
                        int var = sc.nextInt();

                        List1.set(index, var);
                    }
                    break;
                case 3:
                    System.out.println("[ Get executes ]");
                    System.out.print("How many numbers you will Get ?  -> ");
                    n = sc.nextInt();
                    for (int j = 1; j <= n; j++) {
                        System.out.println("\n<- [ " + j + " ]" + " -> \n");

                        System.out.print("Index : ");
                        int index = sc.nextInt();
                        System.out.println("[ " + index + " ]" + " : " + List1.get(index));

                    }
                    break;
                case 4:
                    if (List1.size() == 0) {
                        System.out.println("Empty List!");
                    } else {
                        System.out.println("[ Remove executes ]");
                        System.out.print("How many numbers you will Remove ?  -> ");
                        n = sc.nextInt();
                        for (int j = 1; j <= n; j++) {
                            System.out.println("\n<- [ " + j + " ]" + " -> \n");

                            System.out.print("Index : ");
                            int index = sc.nextInt();
                            System.out.println("[ " + index + " ]" + " : " + List1.remove(index));

                        }
                    }
                    break;

                case 5:
                    System.out.println("[ Add between executes ]");
                    System.out.print("How many numbers you will ADD ?  -> ");
                    n = sc.nextInt();
                    for (int j = 1; j <= n; j++) {
                        System.out.println("\n<- [ " + j + " ]" + " -> \n");

                        System.out.print("Index : ");
                        int index = sc.nextInt();
                        System.out.print("Value : ");
                        int var = sc.nextInt();

                        List1.add(index, var);
                    }
                    break;

                case 6:
                    System.out.println("[ Sort executes ]");
                    System.out.println("Unsorted -> " + List1);
                    Collections.sort(List1);
                    System.out.println("Sorted -> " + List1);
                    break;

                case 7:
                    System.out.println("List -> " + List1);
                    break;

                case 8:
                    System.out.println("System shutdown");
                    break;

                default:
                    System.out.println("Wrong choice!!");
            }
        }
    }
}
