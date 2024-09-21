import java.util.*;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println(Math.pow(5,2));
        System.out.println(Math.min(10, 5));
        System.out.println(Math.max(3,2));
        System.out.println(Math.abs(-10));
        System.out.println(Math.sqrt(1000));
        System.out.println(Math.PI);
        System.out.println(Math.round(10.10));
        System.out.println(Math.sin(90));
        System.out.println(Math.cos(90));


        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nEnter any number 1 - 5 : ");

            int inputNumber = sc.nextInt();
            int rValue = r.nextInt(5) + 1;

            if (inputNumber > 5 || inputNumber < 1) {
                System.out.println("Invalid input number");
            } else if (inputNumber == rValue) {
                System.out.println("Your guess is right");
            } else {
                System.out.println("Your are not current");
            }
        }

    }
}
