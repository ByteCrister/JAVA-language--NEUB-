interface Print_2{
    void print();
}

interface Show{
    void show();
}

class A3 implements Print_2, Show{
    public void print(){
        System.out.println("Hi , A1");
    }

    public void show(){
        System.out.println("Show method From A1");
    }
}


public class Interface_2 {
    public static void main(String[] args) {
        A3 ob=new A3();
        ob.print();
        ob.show();
    }
}
