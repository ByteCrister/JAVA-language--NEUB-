import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                System.out.print(value + " ");
            } else if (sc.hasNextDouble()) {
                Double d = sc.nextDouble();
                System.out.println(d+" ");
            }else{
                String str = sc.next();
                System.out.println(str+" ");
            }

        }
    }
}
