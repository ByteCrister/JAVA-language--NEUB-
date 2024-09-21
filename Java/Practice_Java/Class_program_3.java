class A{
    int a,b;
    A(int A,int B){
        a=A;
        b=B;
    }
    void shape(){
        System.out.println("Method undefined");
    }
}

class B extends A{
    B(int A, int B){
        super(A,B);
    }
    void shape(){
       System.out.println("Class B -> "+a*b);
    }
}
class C extends A{
    C(int A, int B){
        super(A,B);
    }
    void shape(){
       System.out.println("Class C -> "+a*b*2);
    }
}


public class Class_program_3 {
    public static void main(String[] args) {

        A ob=new A(1,1);
        ob.shape();
        
        B ob2=new B(2, 2);
        C ob3=new C(3, 3);

        
        ob=ob2;
        ob.shape();
        ob=ob3;
        ob.shape();
        
    }
}
