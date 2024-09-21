public class TypeConversions {
    public static void main(String[] args) {
        byte b;
        short s = 10;
        int i = s;
        b = (byte) i;

        double d = b;
        float f = (float) d;

        System.out.println("b : " + b + " s : " + s + " i : " + i + " d : " + d + " f : " + f);

        b = 10 * 20 / 10;// Automatic type promotion occurs
        System.out.println("b : " + b);

        b = (byte) (10 * i);// Manually type promotion
        System.out.println("b : " + b);
    }
}
