public class ExceptionHandling_1 {
    public static void main(String[] args) {
        int i = 0, k = 123;
        int ar[] = new int[1];
        try {
            k = k / i;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception found");
        } catch (Exception e) {
            System.out.println("Error found in the program");
        }

        try {
            ar[5] = 1;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception found");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (Exception e) {
            System.out.println("Error found in the program");
        }
    }
}
