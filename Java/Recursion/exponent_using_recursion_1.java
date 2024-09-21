public class exponent_using_recursion_1 {
    public static int callRecursion(int x, int n, int m){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return x*callRecursion(x, n/2, m) * x*callRecursion(x, n/2, m);
        }else{
            return x* x*callRecursion(x, n/2, m) * x*callRecursion(x, n/2, m);
        }
    }
    public static void main(String args[]){
        int x=2, n=4, m=3;

        System.out.println("Ans-> "+callRecursion(x,n,m));

    }
}
