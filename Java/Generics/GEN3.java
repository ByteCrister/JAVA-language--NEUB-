class Gen1<A extends Comparable<A>>{
    A a,b,c;
    Gen1(A a, A b, A c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    A max(){
        if(a.compareTo(b)>0 && a.compareTo(c)>0){
            return a;
        }else if (b.compareTo(c)>0) {
            return b;
        }else{
            return c;
        }
    }

}
public class GEN3 {
    public static void main(String[] args) {
        Gen1<Integer>gen1=new Gen1<>(10,20,10);
        System.out.println("Max : "+gen1.max());

        Gen1<String>gen2=new Gen1<>("Akmal", "Jamal", "Kamal");
        System.out.println("Max : "+gen2.max());
    }
}
