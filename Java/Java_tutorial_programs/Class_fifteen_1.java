import java.util.*;

public class Class_fifteen_1 {
    public static void main(String args[]) {

        // ---------------Bit manipulation---------------

        /* Get bit */
        int bit = 8;
        int pos = 3;
        int bitMask = 1 << pos;

        if ((bitMask & bit) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is 1");
        }

        /* Set bit */
        bit = 5;
        pos = 1;
        bitMask = 1 << pos;
        System.out.println("Bit : " + (bitMask | bit));

        /* Clear bit */
        bit = 5;
        pos = 2;
        bitMask = 1 << pos;
        int b = ~bitMask; // not operation executed on the bitMask
        System.out.println("\nBit : " + (b & bit));

        /* Update bit */
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        bit = 3;
        pos = 1; //2 for set

        bitMask = 1 << pos;
        if (option == 1) {
            // set
            System.out.println("\n Bit : " + (bitMask | bit));
        } else {
            // clear
            int m = ~(bitMask);
            System.out.println("\n Bit : " + (m & bit));
        }

    }
}
