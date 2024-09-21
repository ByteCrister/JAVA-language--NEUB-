class A {
    int height, width, weight;

    A(int a, int b, int c) {
        height = a;
        width = b;
        weight = c;
    }

    int volume() {
        return height * weight * width;
    }
}

class B extends A {
    String srt;

    B(int a, int b, int c, String n) {
        super(a, b, c);
        srt = n;
    }

    void print() {
        System.out.println(srt);
    }

}

public class Class_programs_1 {
    public static void main(String[] args) {
        B ob = new B(1, 2, 2, "Hello");

        ob.print();
        System.out.println(ob.volume());
    }

}