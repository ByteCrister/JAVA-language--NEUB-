class Gen1<Type> {
    Type value;

    Gen1(Type value) {
        this.value = value;
    }

    Type getValue() {
        return this.value;
    }
}

class Gen2<Type1, Type2> {
    Type1 t1;
    Type2 t2;

    Gen2(Type1 t1, Type2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    void show() {
        System.out.println("Value1 : " + this.t1 + ", Value2 : " + this.t2);
    }
}

class Gen3<Type extends Comparable<Type>> {
    Type t1, t2, t3;

    Gen3(Type t1, Type t2, Type t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    Type seeMaxValue() {
        if(t1.compareTo(t2)>0 && t1.compareTo(t3)>0){
            return t1;
        }else if(t2.compareTo(t3)>0){
            return t2;
        }else{
            return t3;
        }
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Gen1<Integer>i1 = new Gen1<>(10);
        System.out.println("Gen1 value : "+i1.getValue());

        Gen1<String>s1 = new Gen1<>("Shakib");
        System.out.println("Gen1 value : "+s1.getValue());


        Gen2<Integer,String>g1 = new Gen2<>(10, "Shakib");
        g1.show();

        Gen2<Double,Boolean>g2 = new Gen2<>(10.10, true);
        g2.show();


        Gen3<Integer>gen2 = new Gen3<>(12, 10, 5);
        System.out.println("Max value : "+gen2.seeMaxValue());

        Gen3<String>gen3 = new Gen3<>("Anik", "Manik","Shakib");
        System.out.println("Max value : "+gen3.seeMaxValue());

    }
}
