
interface fun2{
    public int calculate(int n);
}
public class LamdaExpression_4 {
    public static void main(String[] args) {
        
        fun2 ob1 = (a)->  (a%2);
        
        for(int i=1; i<=10; i++){
            System.out.println(ob1.calculate(i));
        }

        fun2 ob2 = (a)->{
            return (a%2) + 5;
        };

        for(int i=1; i<=10; i++){
            System.out.println(ob2.calculate(i));
        }
        
    }
}
