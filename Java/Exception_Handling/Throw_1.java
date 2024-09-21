public class Throw_1 {
    public static int Divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(Divide(10, 5));
    }
}
