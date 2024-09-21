public class ExceptionHandling_5 {
    public static int Divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {

        try{
            int ans=Divide(3, 0);
            System.out.println(ans);

        }catch(ArithmeticException e){
            System.out.println("Exception occurs");
        }
    }
}
