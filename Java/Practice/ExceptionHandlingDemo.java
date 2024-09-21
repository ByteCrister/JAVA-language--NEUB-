class customException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"This message is from to string";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"This is an custom exception";
    }
}


public class ExceptionHandlingDemo {

    public static void throwException() throws customException{
        try {
            throw new customException();
        } catch (customException e) {
            throw new customException();
        }
    }
    public static void main(String[] args) {
        int a[] = { 1, 2 };
        String str = null;
        // System.out.println(str);

        int c = 10, b = 0;
        try {
            System.out.println(str.length());
            try {
                a[10] = 10;
                try {
                    System.out.println(" 10 / 0 : " + c / b);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Most inner catch executes");
                }
            } catch (ArithmeticException e) {
                System.out.println("Middle catch executes");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            throw new ArithmeticException("This is a demo arithmetic exception");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            throwException();
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            e.toString();
            System.out.println(e);
        }


    }
}
