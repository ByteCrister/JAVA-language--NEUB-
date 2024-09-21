import java.util.Scanner;

class Std {
    private String name;
    private int id;

    Std(String nm, int i) {
        name = nm;
        id = i;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
    }
}

public class Oops_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Students : ");
        int n = sc.nextInt();
        sc.nextLine();
        Std ob[] = new Std[n];

        System.out.println("------------- Enter Student information's -------------");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i+1) + ")");

            System.out.print("\nName -> ");
            String Na = sc.nextLine();

            System.out.print("\nID -> ");
            int ID=sc.nextInt();

            sc.nextLine();

            ob[i]=new Std(Na,ID);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (1+i) + ")");
            ob[i].print();
        }
        sc.close();

    }
}
