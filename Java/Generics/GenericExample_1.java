class Gen<A>{
    A ob;
    Gen(A ob){
        this.ob=ob;
    }
    void typeOf(){
        System.out.println("Type of "+ob+" : "+ob.getClass().getName());
    }

    A getValue(){
        return ob;
    }

}
class GenericExample_1{
    public static void main(String[] args) {
        Gen<Integer>gen1=new Gen<>(100);
        Gen<Double>gen3=new Gen<>(100.10);
        Gen<String>gen2=new Gen<>("Hundred");

        gen1.typeOf();
        gen2.typeOf();
        gen3.typeOf();

        System.out.println("Value of gen1 : "+gen1.getValue());
        System.out.println("Value of gen1 : "+gen2.getValue());
    }
}