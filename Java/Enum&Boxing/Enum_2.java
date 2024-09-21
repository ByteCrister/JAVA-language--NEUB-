enum Devices{
    Car(1000),Mobile(2000),Tv(3000),Laptop(4000);

    private int price;
    Devices(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }
}

public class Enum_2 {
    public static void main(String[] args) {
        
        System.out.println(Devices.Car+" : "+Devices.Car.getPrice());
        System.out.println(Devices.Laptop+" : "+Devices.Laptop.getPrice());

        for(Devices ob : Devices.values()){
            System.out.println(ob+" : "+ob.getPrice());
        }
    }
}
