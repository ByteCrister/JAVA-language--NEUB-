class A{
    void print(){
        System.out.println("A's constructor");
    }
}

class B extends A{
    void print(){
        System.out.println("B's constructor");
    }
}

class C extends A{
    void print(){
        System.out.println("C's constructor");
    }
}
public class Java_exam_1 {
    public static void main(String[] args) {
        A class1 =new A();
        B class2 = new B();
        C class3 =new C();

        A a;
        a=class2;
        a.print();

        a=class3;
        a.print();

        a=class1;
        a.print();

    }
}
