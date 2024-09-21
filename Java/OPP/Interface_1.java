interface Print{
    void print();
}

class A1 implements Print{
    public void print(){
        System.out.println("Hi , A1");
    }
}
class A2 implements Print{
    public void print(){
        System.out.println("Hi , A2");
    }
}

public class Interface_1 {
    public static void main(String[] args) {
        A1 ob=new A1();
        ob.print();

        Print ob1=new A2();
        ob1.print();
    }
}
