interface fun1 {
    public void sayName();
}

public class LamdaExpression_3 {
    public static void main(String[] args) {

        
        fun1 ob1 = new fun1() {
            public void sayName() {
                System.out.println("Shakib");
            }
        };

        ob1.sayName();

    }
}
