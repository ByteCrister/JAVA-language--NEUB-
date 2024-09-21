package PackageExport;

public class PackageOne {
    private int valueA, valueB;
    public PackageOne(int a, int b){
        valueA = a;
        valueB = b;
    }

    public void show(){
        System.out.println("a : "+valueA+", b : "+valueB);
    }
}