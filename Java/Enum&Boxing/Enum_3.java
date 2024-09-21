enum demoPrice {
    Mobile(10), Car(20), Laptop(30), Tv(40);

    private int price;

    demoPrice(int i) {
        this.price = i;
    }

    public int getPrice() {
        return price;
    }
}

public class Enum_3 {
    public static void main(String[] args) {
        System.out.println(demoPrice.Laptop.getPrice());
        for (demoPrice obj : demoPrice.values()) {
            System.out.print(obj + " ");
        }
    }
}
