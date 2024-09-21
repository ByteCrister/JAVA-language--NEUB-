public class Boxing_2 {
    public static Integer CallObjValue(int value) {
        return value;
    }

    public static int CallPreValue(int value) {
        return value;
    }

    public static void main(String[] args) {
        Integer ob1 = CallPreValue(100);

        System.out.println(ob1);

        int ob2 = CallObjValue(200);
        ob1 = ob2;
        System.out.println(ob1);
    }
}
