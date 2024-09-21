interface Interface__3 {

    int var=100;

    default void defaultMessage() {
        System.out.println("This is a default message from the interface");
    }

    void inter_3();
}

interface Interface_3_1 extends Interface__3 {
    void inter_3_1();
}

class Inter3 implements Interface_3_1 {
    public void inter_3() {
        System.out.println("Hi");
    }

    public void inter_3_1() {
        System.out.println("Hi....");
    }
}

public class Interface_3 {
    public static void main(String[] args) {
        Inter3 ob = new Inter3();
        ob.inter_3();
        ob.inter_3_1();

        Interface__3 ob1 = new Inter3();
        ob1.inter_3();

        ob1.defaultMessage();
        System.out.println(Interface__3.var);
    }
}
