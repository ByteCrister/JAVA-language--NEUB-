interface RunCalculate {
    public int calculate(int value);
}

public class LambdaExpression {
    public static void main(String[] args) {
        RunCalculate ob1 = (int value)->{
            int sum = 0;
            for(int i=1; i<=value; i++){
                sum+=i;
            }
            return sum;
        };

        System.out.println(ob1.calculate(10));




        ob1 = (int value)->{
            int multiplication =  1;
            for(int i=1; i<=value; i++){
                multiplication*=i;
            }
            return multiplication;
        };

        System.out.println(ob1.calculate(10));


    }
}
