import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TryCatch_1 {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        PrintWriter pw;
        int ar[] = { 1 };
        String st = null, st1 = "none";

        try {
            a = a / b;
            System.out.println("Exception did not occurs");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        try {
            pw = new PrintWriter("abc.txt");
            pw.println("File saved");
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        }

        try {
            ar[9] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fix the index of the array");
        }

        try {
            int l = st.length();
            System.out.println("Length : " + l);
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }

        try {
            c = Integer.parseInt(st1);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("File saved");

    }
}
