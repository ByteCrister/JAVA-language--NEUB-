public class String_Class_1 {
    public static void main(String[] args) {
        String st1 = "Im";
        String st2 = st1 + " shakib.";
        System.out.println(st2);

        String st3 = " I live in Sylhet. Im " + (10 + 12) + " years old";
        String st4 = st2.concat(st3);
        System.out.println(st4);

        System.out.println("Length : " + st4.length());

        String st5 = "New Stirng";
        String st6 = new String(st5);
        // String st6=st5;
        if (st5.equals(st6)) {
            System.out.println(st5.equals(st6));
        } else {
            System.out.println(st5.equals(st6));
        }

        if (st5 == st6) {
            System.out.println(st5 == st6);
        } else {
            System.out.println(st5 == st6);
        }

        String st7 = "NeUb";
        String st8 = "NEUB";
        if (st7.equals(st8)) {
            System.out.println(st7.equals(st8));
        } else {
            System.out.println(st7.equals(st8));
        }

        if (st7.equalsIgnoreCase(st8)) {
            System.out.println(st7.equalsIgnoreCase(st8));
        } else {
            System.out.println(st7.equalsIgnoreCase(st8));
        }


        System.out.println("A".compareTo("B"));
        System.out.println("shakib".startsWith("sh"));
        System.out.println("shakib".startsWith("sh"));

        System.out.println("shakib".charAt(2));

        System.err.println("shakib".indexOf("b"));
        System.err.println("shakib".lastIndexOf('i',5));

        System.err.println("Im shakib".substring(3,9));

        System.out.println("Hi ".concat("shakib"));
        System.out.println("shakib".replace('h','a'));

    }
}
