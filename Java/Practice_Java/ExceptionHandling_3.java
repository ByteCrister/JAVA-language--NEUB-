import java.util.Random;

public class ExceptionHandling_3 {
    public static void main(String[] args) {
        int a, b, c;
        int ar[]=new int[10], index=-1;
        Random r = new Random();
        for (int i = 1; i <= 1000; i++) {
            b = r.nextInt();
            c = r.nextInt();

            try {
                a = 12345 / (b / c);
                ar[++index]=a;

                String st=null;

            } catch (ArithmeticException e) {
                System.out.println(e+"-----");
            } catch (NullPointerException e) {
                System.out.println(e+"-----------");
            }catch(IndexOutOfBoundsException e){
                System.out.println(e+"--------------------");
                index=-1;
            }catch (Exception e) {
                System.out.println(e+"-------------------------------");
            }

            finally {
                System.out.println("System ends");
            }
        }

    }
}
