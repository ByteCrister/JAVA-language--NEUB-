class Phone{
    String color;
    String name;

    void printInfo(){
        System.out.println(this.color);
        System.out.println(this.name);
    }

    Phone(){

    }

    private int a,b;
    Phone(int a, int b){
        this.a=a;
        this.b=b;
    }

    void printNum(){
        System.err.println(a+" "+b);
    }

    Phone( Phone ob){
        this.color=ob.color;
        this.name=ob.name;
    }
}

public class Oops_1{
    public static void main(String[] args) {
        

        Phone p1,p2;
        p1=new Phone();
        p2=new Phone();

        p1.color="White";
        p2.color="Golden";

        p1.name="Samsung";
        p2.name="Asus";


        p1.printInfo();
        p2.printInfo();

        Phone p3,p4;
        p3=new Phone(10,20);
        p3.printNum();

        p4=new Phone(p1);

        p4.printInfo();

    }
}