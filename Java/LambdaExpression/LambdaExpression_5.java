interface Lm5{
    int sum(int n);
}
public class LambdaExpression_5 {
    public static void main(String[] args) {
        Lm5 ob = n->{
            int sum=0;
            for(int i=1; i<=n ; i++){
                sum+=i;
            }
            return sum;
        };

        System.out.println(ob.sum(100));
    }
}
