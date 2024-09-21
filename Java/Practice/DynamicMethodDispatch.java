class Dispatch1 {
    void show() {
        System.out.println("Dispatch one");
    }
}

class Dispatch2 extends Dispatch1 {
    void show() {
        System.out.println("Dispatch two");
    }
}

class Dispatch3 extends Dispatch1 {
    void show() {
        System.out.println("Dispatch three");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Dispatch1 ob;

        Dispatch1 ob1 = new Dispatch1();
        ob1.show();

        Dispatch2 ob2 = new Dispatch2();
        ob2.show();

        Dispatch3 ob3 = new Dispatch3();
        ob3.show();


        /********** Dynamic method dispatch - Run time polymorphism ***********/
        ob = ob2;
        ob.show();

        ob = ob3;
        ob.show();

    }
}
