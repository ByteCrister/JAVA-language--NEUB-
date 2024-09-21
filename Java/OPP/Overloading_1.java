class Overload{
    private int a;
    private int b;

    private String name;
    private String age;

    int A;
    String B;
    Overload(Overload a){
        this.a=a.a;
        this.b=a.b;
        this.name=a.name;
        this.age=a.age;
        this.A=a.A;
        this.B=a.B;
    }

    Overload(int a, int b){
        this.a=a;
        this.b=b;
    }

    Overload(String a, String b){
        this.name=a;
        this.age=b;
    }

    double show(int c){
        return Math.PI*this.a*this.b*c;
    }

    int show(int a, int b){
        return a+b;
    }

    void show(){
        System.out.println("a :"+a+" b:"+b+" Name:"+name+" Age:"+age+" A:"+A+" B:"+B);
    }
}
public class Overloading_1 {
    public static void main(String[] args) {
        
        Overload ob1=new Overload(10,20);
        ob1.A=100;
        ob1.B="Shakib";
        ob1.show();
        System.out.println(ob1.show(200));


        Overload ob2=new Overload(ob1);
        ob2.show();

        Overload ob3=new Overload("Shakib","22");
        ob3.show();

        Overload ob4=new Overload(ob3);
        ob4.show();
        
    }
}
