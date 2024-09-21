public class Finally_1 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            a/=b;//ArithmeticException
        }catch(NullPointerException e){
            System.out.println(e);
        }

        finally{
            System.out.println("Finally statement executes");
        }

        System.out.println("All codes runs");
    }
}
