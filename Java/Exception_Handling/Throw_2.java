class MyCustomException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"The parameter can not be negative";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"Chose usable parameter";
    }
}

public class Throw_2 {

    public static double Area(int radius) throws MyCustomException{
        if(radius<0){
            throw new MyCustomException();
        }
        return Math.PI*radius*radius;
    }

    public static int Divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(Divide(10, 0));
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

        try{
            double R=Area(-2);
            System.out.println("Radius : "+R);
        }catch(MyCustomException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
