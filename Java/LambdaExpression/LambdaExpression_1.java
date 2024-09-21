
 interface LmE_1 {
    int Factorial(int n);
    
}

public class LambdaExpression_1{
    public static void main(String[] args) {
        
        LmE_1 ob = (n)->{
            int fac=1;
            for(int i=1; i<=n; i++){
                fac*=i;
            }
            return fac;
        };


        System.out.println(ob.Factorial(10));
    }
}