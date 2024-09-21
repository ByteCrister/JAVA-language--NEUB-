class Gen_3<T extends Number>{
    // T ar[];
    // Gen(T ob[]){
    //     ar=ob;
    // }

    T ob;
    Gen_3(T ob){
        this.ob=ob;
    }

    double Rad(){
        return ob.doubleValue() * ob.doubleValue() *Math.PI;
    }

    // double Avg(){
    //     double sum=0.0;
    //     for(int i=0; i<ar.length; i++){
    //         sum+=ar[i].doubleValue();
    //     }

    //     return sum/(ar.length);
    // }
}
public class Gen_2 {
    public static void main(String[] args) {
        // Integer ar[]={10,11,12,13,14,15};
        Gen_3<Integer>gen1=new Gen_3<>(100);
        System.out.println(gen1.Rad());
    }
}
