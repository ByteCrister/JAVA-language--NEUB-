class A {
  A() {
    System.out.println("A's constructor");
  }
}
class B extends A {
  B() {
    System.out.println("B's constructor");
  }
}
class C extends B{
  C() {
    System.out.println("C's constructor");
  }
}

public class Class_programs_one {
  public static void main(String[] args) {
    // A ob1 = new A();
    // B ob2 = new B();
    C ob3 = new C();
}
}