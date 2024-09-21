public class recursion_1 {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
          return 0;  
        }
        
        return x*power(x, n-1);
    }
    public static void main(String args[]){
        int x=3,n=2;
        
        System.out.println( power(x,n));
    }
}
