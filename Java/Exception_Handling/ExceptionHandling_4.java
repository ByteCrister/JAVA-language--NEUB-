import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExceptionHandling_4 {
    public static void main(String[] args) {
        File f = new File("None.txt");
        String st="Im shakib";
        try {
            Scanner sc = new Scanner(f);
            st = sc.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }

        System.out.println(st);
    }
}
