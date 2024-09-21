class Name{
    protected String name;
    protected int age;
}

class print extends Name{
    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    print(String name, int age){
        this.name=name;
        this.age=age;
    }
}


public class Single_level_inheritence {
    public static void main(String[] args) {
        print ob=new print("Shakib", 21);

        ob.printInfo();

    }
}
