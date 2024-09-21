import java.util.Random;

public class ExceptionHandling_2 {
    public static void main(String[] args) {
        int a, b, c;
        Random r = new Random();

        for (int i = 1; i < 1000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);

                System.out.println("iteration : " + i);
            } catch (ArithmeticException e) {
                System.out.println("arithmetic exception : "+e);
            } catch (Exception e) {
                System.out.println("Normal Exception : "+e);
            }
        }
    }

}
