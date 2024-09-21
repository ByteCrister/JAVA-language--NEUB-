abstract class InnerClass1 {
    int a, b, exponentOfb;

    InnerClass1(int a, int b) {
        this.a = a;
        this.b = b;
        this.exponentOfb = (int) Math.pow(b, b);
    }

    abstract void show();

}

class InnerClass2 extends InnerClass1 {
    InnerClass2(int a, int b) {
        super(a, b);
    }

    public void show() {
        System.out.println("a : " + a + " b : " + b + " c : " + super.exponentOfb);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        InnerClass2 ob = new InnerClass2(10, 20);

        ob.show();
    }
}
