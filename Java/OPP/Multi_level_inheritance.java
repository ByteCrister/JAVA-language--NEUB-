class Name{
    protected String name;
    protected int age;
}

class print extends Name{
    print(){
        
    }
    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    print(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Print2 extends print{
     void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Multi_level_inheritance {
    public static void main(String[] args) {
        
    }
}
