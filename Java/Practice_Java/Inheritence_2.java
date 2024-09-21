class A{
    A(){
        System.out.println("Class A runs");
    }
}
class B extends A{
    B(){
        System.out.println("Class B runs");
    }
}
class C extends A{
    C(){
        System.out.println("Class C runs");
    }
}
public class Inheritence_2 {
    public static void main(String[] args) {
        C ob=new C();
    }
}
