public class TryCatch_2 {
    public static void main(String[] args) {
        int a=10,b=0,ar[]=new int[2];

        try{
            try{
                a/=b;
            }catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                String n = null;
                System.out.println(n);
                ar[9]=0;//ArrayIndexOutOfBound Exception
            }catch(NullPointerException e){
                System.out.println(e);
            }

            System.out.println("Inner block execution finished");
        }catch(Exception e){
            System.out.println("Outer catch block executes");
        }

        System.out.println("All blocks finished");
    }
}
