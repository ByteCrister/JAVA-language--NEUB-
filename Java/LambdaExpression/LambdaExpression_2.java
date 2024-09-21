/**
 * InnerLambdaExpression_2
 */
 interface LmE_2 {
    void Name(String name);
    
}
public class LambdaExpression_2 {
    public static void main(String[] args) {
        LmE_2 ob=(name)-> System.out.println(name);

        ob.Name("Shakib");
    }
}
