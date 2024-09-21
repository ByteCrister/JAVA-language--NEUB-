enum Fruits {
    Apple(10), Banana(20), Grape(30);

    int price;

    Fruits(int price) {
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }
}

public class EnumerationDemos {
    public static void main(String[] args) {

        try {
            /********* use of valueOf() ********/
            System.out.println(Fruits.valueOf("Apple"));
            System.out.println(Fruits.valueOf("Banana"));


            /******** use of getPrice() *********/
            System.out.println("Price of Apple : "+Fruits.Apple.getPrice());
            System.out.println("Price of Banana : "+Fruits.Banana.getPrice());


            /************ use of values() **********/
            System.out.print("\n[ ");
            for(Fruits value : Fruits.values()){
                System.out.print(value+" ");
            }
            System.out.print(" ]\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
